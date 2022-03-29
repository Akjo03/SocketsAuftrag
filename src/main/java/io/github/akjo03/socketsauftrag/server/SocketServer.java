package io.github.akjo03.socketsauftrag.server;

import lombok.SneakyThrows;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketServer implements Runnable {

	public static void main(String[] args) {
		Thread ServerStart = new Thread(new SocketServer());
		ServerStart.run();
	}

	@SneakyThrows
	@Override
	public void run() {
		Scanner sc;
		ServerSocket server = new ServerSocket(8090 );
		System.out.println("(Server) Server running at: " + server.getLocalPort());

		while (true) {
			Socket socket = server.accept();
			sc = new Scanner(socket.getInputStream());
			System.out.println(sc.nextLine()); // print response
		}
	}
}