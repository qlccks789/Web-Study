package net07.appserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest04 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			Socket client = new Socket("localhost", 10001);
			DataInputStream dis = new DataInputStream(
					client.getInputStream()
			);
			DataOutputStream dos = new DataOutputStream(
					client.getOutputStream()
			);
			
			while (true) {
				System.out.print("서버에 전송할 메세지 : ");
				String sendMsg = sc.nextLine();
				dos.writeUTF(sendMsg);
				if ("exit".equals(sendMsg)) {
					break;
				}
				String echoMsg = dis.readUTF();
				System.out.println("서버에서 받은 메세지 : " + echoMsg);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}








