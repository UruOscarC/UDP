package com.ogcg.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new QuoteServerThread().start();
	}

}
