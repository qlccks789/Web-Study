/**
 * 응답 작업 모듈화 하기
 * 
 * - HttpServletResponse
 */
package net08.webserver;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import server.HttpServletResponse;

public class Test07 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				HttpServletResponse response = new HttpServletResponse(
					client.getOutputStream()	
				); 
				response.setContentType("text/html; charset=utf-8");
				String msg = "<!DOCTYPE html>"
						   + "<html>"
						   + "  <head>"
						   + "    <meta charset='utf-8'>"
						   + "    <title>웹서버 구현</title>"
						   + "  </head>"
						   + "  <body>"
						   + "    <h1>응답 모듈화</h1>"
						   + "  </body>"
						   + "</html>";
				
				PrintWriter out = response.getWriter();
				out.println(msg);
				out.close();
				
				// 사용자가 입력한 내용과 헤더 정보를 결합해서 전송
				response.send();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


















