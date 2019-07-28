package net08.webserver;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import server.HttpServletRequest;

public class Test06 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				HttpServletRequest request = new HttpServletRequest(
						client.getInputStream()
				);
				// http://localhost:8000/board/detail.do?no=77&commentNo=1
				// GET
				String method = request.getMethod();
				// /board/detail.do
				String requestURI = request.getRequestURI();
				// no=77&commentNo=1
				String queryString = request.getQueryString();
				// 77
				String no = request.getParameter("no");
				System.out.println("method : " + method);
				System.out.println("requestURI : " + requestURI);
				System.out.println("queryString : " + queryString);
				System.out.println("no : " + no);
				
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + "  <head>"
						   + "    <meta charset='utf-8'>"
						   + "    <title>웹서버 구현</title>"
						   + "  </head>"
						   + "  <body>"
						   + "    <h1>모듈화...</h1>"
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










