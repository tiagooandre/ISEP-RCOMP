package SDP;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.file.Files;

public class Client implements SDP2021 {
    //private Socket socket;
    private SSLSocket socket;

    @Override
    public Socket getSocket() {
        return socket;
    }

    public Client(InetAddress host, int port) throws IOException {
        socket = null;
        SSLSocketFactory f = null;
        f = (SSLSocketFactory) SSLSocketFactory.getDefault();
        try {
            socket = (SSLSocket) f.createSocket(host, port);
        } catch (IOException ioException) {
            throw new IOException(ioException.getMessage());
        }
    }

    public Client(String host, int port) throws IOException {
        socket = null;
        SSLSocketFactory f = null;
        f = (SSLSocketFactory) SSLSocketFactory.getDefault();
        try {
            socket = (SSLSocket) f.createSocket(host, port);
        } catch (IOException ioException) {
            throw new IOException(ioException.getMessage());
        }
    }

    public void sendFile(String filename, String destination) throws IOException {
        sendMessage(Code.NOME_FICHEIRO, destination.getBytes());
        if (!receivesAnswear(Code.ENTENDIDO))
            throw new IOException("Can't send file name.");

        File file = new File(filename);
        System.out.println("Sending file...");
        byte[] buffer = Files.readAllBytes(file.toPath());

        int number_segments = buffer.length / max_bytes;

        for (int i = 0; i < number_segments; i++) {
            byte[] buffer_segment = new byte[max_bytes];
            System.arraycopy(buffer, i * 255, buffer_segment, 0, max_bytes);
            System.out.println("Send segment.");
            sendMessage(Code.SEGMENTO, buffer_segment);
            if (!receivesAnswear(Code.ENTENDIDO))
                throw new IOException("Can't send the " + (i + 1) + " segment.");
        }
        System.out.println("Send file finished.");
        int remain = buffer.length - number_segments * max_bytes;
        byte[] fim_buffer = new byte[remain];
        System.arraycopy(buffer, number_segments * 255, fim_buffer, 0, remain);
        sendMessage(Code.FIM_FICHEIRO, fim_buffer);
        if (!receivesAnswear(Code.ENTENDIDO))
            throw new IOException("Can't send finish file");
    }

    public void closeConnection() throws IOException {
        System.out.println("Close Connection.");
        sendMessage(Code.FIM);
        socket.close();
        if (!receivesAnswear(Code.ENTENDIDO))
            throw new IOException("Can't close connection from the server's side.");
    }
}
