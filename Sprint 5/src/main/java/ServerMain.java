import SDP.SDP2021;
import SDP.Server;

import java.io.IOException;
public class ServerMain {

    public static void main(String[] args) throws IOException {
        System.setProperty("javax.net.ssl.keyStore", "server.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "rcomp2dn");
        System.setProperty("javax.net.ssl.trustStore", "truststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "rcomp2dn");

        new Server("").start();
        Server server = new Server("/");
        server.start();
    }
}
