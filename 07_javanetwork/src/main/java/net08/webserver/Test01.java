package net08.webserver;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01 {
	public static void main(String[] args) {
		// 웹브라우져와 통신하기
		// 주의!!!
		// 응답 규약을 지켜서 데이터를 전송해야 한다.
		/*
		 * 시작라인
		 * 헤더:값 
		 * 헤더:값 
		 * 헤더:값 
		 * 
		 * 바디(데이터)
		 */
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + "  <head>"
						   + "    <meta charset='utf-8'>"
						   + "    <title>웹서버 구현</title>"
						   + "  </head>"
						   + "  <body>"
						   + "    <h1>서버 응답 성공했음</h1>"
						   + "  </body>"
						   + "</html>";
				
				String startline = "HTTP/1.1 200 OK\r\n";
				String headers = 
						"Content-Type: text/html; charset=utf-8\r\n"
					  + "Content-Length: " + msg.getBytes("utf-8").length + "\r\n\r\n";
				String body = msg;
				
				String data = startline + headers + body;
				
				OutputStream out = client.getOutputStream();
				out.write(data.getBytes("utf-8"));
				out.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}














