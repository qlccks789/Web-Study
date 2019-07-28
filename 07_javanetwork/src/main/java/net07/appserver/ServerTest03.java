package net07.appserver;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest03 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				System.out.println("클라이언트 요청 대기중..");
				Socket client = server.accept();
				DataOutputStream dos = new DataOutputStream(
						client.getOutputStream()
				);
				dos.writeUTF("안녕하세요~");
				dos.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









