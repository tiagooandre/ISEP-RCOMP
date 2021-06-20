import SDP.Client;
import SDP.Server;

import java.io.IOException;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter server's IP address:");
		String IPADD = scanner.next();

		Client client = new Client(IPADD, Server.port);
		client.sendFile("ClientMain.java", "CopiedFile.txt");
		client.closeConnection();
	}
}
