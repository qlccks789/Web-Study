package net08.webserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test02 {
	public static void main(String[] args) {
		// 요청 시의 HTTP 규약 확인하기
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				
				BufferedReader br = new BufferedReader(
					new InputStreamReader(
							client.getInputStream(), "utf-8"     
					)
				);		
				// 요청 시작라인 
				String reqStartline = br.readLine();
				
				StringBuilder reqHeaders = new StringBuilder();
				while (true) {
					String header = br.readLine();
					if ("".equals(header)) break;
					
					reqHeaders.append(header + "<br>");
				}
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + "  <head>"
						   + "    <meta charset='utf-8'>"
						   + "    <title>웹서버 구현</title>"
						   + "  </head>"
						   + "  <body>"
						   + "    <h1>시작라인 : " + reqStartline + "</h1>"
						   + "    <div>"
						   + "      <h2>헤더정보</h2>"
						   + "      <div>"
						   +        reqHeaders.toString()  
						   + "      </div>"
						   + "    </div>"
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














