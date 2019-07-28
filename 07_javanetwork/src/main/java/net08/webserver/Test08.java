/**
 * 
 * http://localhost:8000/test.do?num=3&msg=hello
 * 
 * 위의 URL로 서버에 요청하게 되면 사용자 브라우져에 다음과 같이 출력될 수 있도록 코딩 작성
 * 
 * hello
 * hello
 * hello
 */
package net08.webserver;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import server.HttpServletRequest;
import server.HttpServletResponse;

public class Test08 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8000);
			while (true) {
				Socket client = server.accept();
				
				HttpServletRequest request = new HttpServletRequest(
						client.getInputStream()
				); 
				HttpServletResponse response = new HttpServletResponse(
						client.getOutputStream()
				); 
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				
				// num=3&msg=hello
				int num = Integer.parseInt(
						request.getParameter("num")
				);
				String msg = request.getParameter("msg");
				System.out.println("num : " + num);
				System.out.println("msg : " + msg);
				
				String resMsg = "";
				for (int i = 0; i < num; i++) {
					resMsg += msg + "<br>";
				}
				
				
				String html = "<!DOCTYPE html>"
						    + "<html>"
						    + "  <head>"
						    + "    <meta charset='utf-8'>"
						    + "    <title>웹서버 구현</title>"
						    + "  </head>"
						    + "  <body>"
						    + resMsg		
						    + "  </body>"
						    + "</html>";
				out.println(html);
				out.close();
				
				response.send();
				
				client.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}












