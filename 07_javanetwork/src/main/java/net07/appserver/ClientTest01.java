package net07.appserver;

import java.net.Socket;

public class ClientTest01 {
	public static void main(String[] args) {
		try {
			// 서버에 접속하기 위해서 클라이언트 작성...
			Socket client = new Socket("localhost", 10001);
			System.out.println("서버 접속 성공함...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
