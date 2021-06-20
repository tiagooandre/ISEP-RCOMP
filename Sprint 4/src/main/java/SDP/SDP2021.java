package SDP;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public interface SDP2021 {
    Socket getSocket();
    int version = 0, max_bytes = 255;

    default void sendMessage(Code code) throws IOException {
        DataOutputStream out = new DataOutputStream(getSocket().getOutputStream());
        out.writeByte(version);
        out.writeByte(code.code);
        out.writeByte(0);
    }

    default void sendMessage(Code code, byte[] data) throws IOException {
        DataOutputStream out = new DataOutputStream(getSocket().getOutputStream());
        out.writeByte(version);
        out.writeByte(code.code);
        int number_bytes = data.length;
        out.writeByte(number_bytes);
        out.write(data);
    }

    default boolean receivesAnswear (Code answear) throws IOException {
        DataInputStream in = new DataInputStream(getSocket().getInputStream());
        in.readByte();
        Code codigo = Code.valueOf(in.readByte());
        int n_bytes = in.readByte();
        if (n_bytes != 0) {
            for (int i = 0; i < n_bytes; i++)
                in.readByte();
        }
        if (codigo != answear) {
            System.out.println("Received message " + codigo + ".");
            return false;
        }
        return true;
    }

    enum Code {
        TESTE(0),
        FIM(1),
        ENTENDIDO(2),
        FIM_FICHEIRO(3),
        NOME_FICHEIRO(4),
        ERRO(5),
        DISPONIVEL(6),
        SEGMENTO(255);

        public int code;

        Code(int code) {
            this.code = code;
        }

        public static Code valueOf(int c) {
            for (Code code : Code.values())
                if (c == code.code) {
                    return code;
                }
            return null;
        }
    }
}
