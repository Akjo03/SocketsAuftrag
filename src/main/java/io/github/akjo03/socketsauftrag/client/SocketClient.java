package io.github.akjo03.socketsauftrag.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {

	private Socket clientSocket;
	private PrintWriter out;
	private BufferedReader in;

	public static void main(String[] args) throws IOException {
		SocketClient client = new SocketClient();
		client.startConnection("localhost", 8090);
		String resp = client.sendMessage("Good afternoon");
		System.out.println(resp);
	}

	public void startConnection(String ip, int port) throws IOException {
		clientSocket = new Socket(ip, port);
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
	}

	public String sendMessage(String msg) throws IOException {
		out.println(msg);
		String resp = in.readLine();
		return resp;
	}

	public void stopConnection() throws IOException {
		in.close();
		out.close();
		clientSocket.close();
	}
}