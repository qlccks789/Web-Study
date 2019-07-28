package net07.appserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest04 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				System.out.println("클라이언트 요청 대기");
				Socket client = server.accept();
				
				DataInputStream dis = new DataInputStream(
						client.getInputStream()
				);
				DataOutputStream dos = new DataOutputStream(
						client.getOutputStream()
				);
				while (true) {
					String receiveMsg = dis.readUTF();
					if ("exit".equals(receiveMsg)) {
						break;
					}
					dos.writeUTF(receiveMsg);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









