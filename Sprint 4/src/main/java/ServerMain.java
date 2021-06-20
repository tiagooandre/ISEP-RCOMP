import SDP.SDP2021;
import SDP.Server;

import java.io.IOException;
public class ServerMain {

    public static void main(String[] args) throws IOException {
        new Server("").start();
        Server server = new Server("/");
        server.start();
    }
}
