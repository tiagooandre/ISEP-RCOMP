package SDP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Server {
    private ServerSocket ss;
    private String directory;

    public static final int port = 32507;

    public Server(String directory) throws IOException {
        try {
            ss = new ServerSocket(port);
            this.directory = directory;
            Path path = Paths.get(directory);
            System.out.println(path.toAbsolutePath());
            Files.createDirectories(path);
            System.out.printf("Server running on port " + port + "...\n");
        } catch (IOException e) {
            throw new IOException("Error: Server\n");
        }
    }

    public void start() {
        while (true) {
            try {
                Socket clientS = ss.accept();
                new Thread(new ReceiveSocket(clientS)).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ReceiveSocket implements Runnable, SDP2021 {
        private FileOutputStream fout = null;
        private DataInputStream in;
        private Socket socket;

        public ReceiveSocket(Socket clientS) throws IOException {
            socket = clientS;
            in = new DataInputStream(socket.getInputStream());
        }

        public Socket getSocket() {
            return socket;
        }

        private boolean openFile(int size) throws IOException {
            byte[] str = new byte[size];
            for (int i = 0; i < size; i++)
                str[i] = in.readByte();

            String fileName = new String(str);
            System.out.println("Received file name: " + fileName + "\n");
            try {
                File file = new File(directory + fileName);
                fout = new FileOutputStream(file.getAbsolutePath());
                System.out.println("File " + file.getPath() + " open");
                sendMessage(Code.ENTENDIDO);
                return true;
            } catch (FileNotFoundException e) {
                System.out.printf("Can't open the file!");
                return false;
            }
        }

        private void closeFile(int number_bytes) throws IOException {
            byte[] buffer = new byte[number_bytes];
            for (int i = 0; i < number_bytes; i++)
                buffer[i] = in.readByte();
            fout.write(buffer);
            fout.close();
        }

        private void addSegment(int number_bytes) throws IOException {
            byte[] buffer = new byte[number_bytes];
            for (int i = 0; i < number_bytes; i++) {
                buffer[i] = in.readByte();
            }
            fout.write(buffer);
        }

        @Override
        public void run() {
            try {
                boolean flag = false;
                do {
                    byte version = in.readByte();
                    System.out.printf("Version: " + version + "\n");

                    byte code = in.readByte();
                    int converted_code = code < 0 ? code + 256 : code;
                    Code code_c = Code.valueOf(converted_code);
                    System.out.printf("Code: " + code_c + "\n");

                    byte number_bytes = in.readByte();
                    int converted_number_bytes = number_bytes < 0 ? number_bytes + 256 : number_bytes;
                    System.out.printf("Number bytes: " + converted_number_bytes + "\n");

                    switch(code_c) {
                        case TESTE:
                            sendMessage(Code.ENTENDIDO);
                            break;

                        case FIM:
                            if (fout != null) {
                                System.out.printf("You need to send the file or segment.");
                                sendMessage(Code.ERRO);
                            }
                            System.out.printf("FIM!");
                            flag = true;
                            break;

                        case FIM_FICHEIRO:
                            if (fout == null) {
                                System.out.println("Missing file name.");
                                sendMessage(Code.ERRO);
                                flag = true;
                            } else {
                                closeFile(converted_number_bytes);
                                sendMessage(Code.ENTENDIDO);
                                fout = null;
                            }
                            break;

                        case NOME_FICHEIRO:
                            if (openFile(converted_number_bytes)) {
                                sendMessage(Code.ENTENDIDO);
                            } else {
                                sendMessage(Code.ERRO);
                                flag = true;
                            }
                            break;

                        case SEGMENTO:
                            if (fout == null) {
                                System.out.println("Missing file name.");
                                sendMessage(Code.ERRO);
                                flag = true;
                            } else {
                                if (converted_number_bytes != max_bytes) {
                                    sendMessage(Code.ERRO);
                                }
                                addSegment(converted_number_bytes);
                                sendMessage(Code.ENTENDIDO);
                            }
                            break;
                    }
                } while (!flag);
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
