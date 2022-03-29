package io.github.akjo03.socketsauftrag.client;

import io.github.akjo03.util.logging.v2.Logger;
import io.github.akjo03.util.logging.v2.LoggerManager;

public class SocketClient implements Runnable {
	private static final Logger LOGGER = LoggerManager.getLogger(SocketClient.class);

	private SocketClient() {}

	public static void main(String[] args) {
		new SocketClient().run();
	}

	@Override
	public void run() {

	}
}