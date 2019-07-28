package net07.appserver;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest02 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(10001);
			while (true) {
				System.out.println("클라이언트 요청 대기중...");
				Socket client = server.accept();
				
				System.out.println("클라이언트에게 5초후 메세지 전송함");
				Thread.sleep(5000);
				
				// 접속한 클라이언트에게 메세지를 전송하자...
				OutputStream out = client.getOutputStream();
				out.write("안녕하세요~".getBytes("utf-8"));
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}











