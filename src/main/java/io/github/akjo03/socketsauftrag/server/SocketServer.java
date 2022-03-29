package io.github.akjo03.socketsauftrag.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer implements Runnable {
	private SocketServer() {}

	public static void main(String[] args) {
		Thread ServerStart = new Thread(new SocketServer());
		ServerStart.run();
	}

	@Override
	public void run() {

		try {
			Scanner sc;
			ServerSocket server = new ServerSocket(8090 );
			System.out.println("(Server) Server running at: " + server.getLocalPort());

			while (true) {
				Socket socket = server.accept();
				sc = new Scanner(socket.getInputStream());

				System.out.println(sc.toString());
			}


		} catch (Exception e) {

		}
	}
}