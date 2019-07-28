package net07.appserver;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientTest03 {
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 10001);
			DataInputStream dis = new DataInputStream(
				client.getInputStream()
			);	
			String data = dis.readUTF();
			System.out.println("서버에서 전송된 데이터 : " + data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








