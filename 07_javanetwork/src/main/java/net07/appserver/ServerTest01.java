package net07.appserver;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest01 {
	public static void main(String[] args) {
		try {
			// 10001번 포트로 서비스 되는 서버 생성
			ServerSocket server = new ServerSocket(10001);
			
			// 서버가 해야 할 일...
			while (true) {
				// 클라이언트가 요청을 했을 때 바로 응답하기 위해서
				// 클라이언트의 요청을 대기..
				System.out.println("클라이언트 요청 대기중...");
				Socket socket = server.accept();
				InetAddress addr = socket.getInetAddress();
				System.out.println("클라이언트 접속 : " + addr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













