package io.github.akjo03.socketsauftrag.server;

import io.github.akjo03.socketsauftrag.client.SocketClient;
import io.github.akjo03.util.logging.v2.Logger;
import io.github.akjo03.util.logging.v2.LoggerManager;

public class SocketServer implements Runnable {
	private static final Logger LOGGER = LoggerManager.getLogger(SocketClient.class);

	private SocketServer() {}

	public static void main(String[] args) {
		new SocketServer().run();
	}

	@Override
	public void run() {

	}
}