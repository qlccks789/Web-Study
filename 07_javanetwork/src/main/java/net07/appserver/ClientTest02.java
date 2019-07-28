package net07.appserver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTest02 {
	public static void main(String[] args) {
		/*
		 *   서버에 접속 후 서버에서 전송한 메세지를 읽는 코드 작성
		 */
		try {
			Socket client = new Socket("localhost", 10001);
			InputStream in = client.getInputStream();
			BufferedReader br = new BufferedReader(
				new InputStreamReader(in, "utf-8")
			);
			System.out.println("서버 데이터 기다리는 중...");
			String receiveData = br.readLine();
			System.out.println("서버에서 전송된 데이터 : " + receiveData);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}











