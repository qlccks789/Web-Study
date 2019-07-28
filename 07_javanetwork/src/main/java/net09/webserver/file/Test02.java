package net09.webserver.file;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import server.FileUtil;
import server.HttpServletRequest;
import server.HttpServletResponse;

public class Test02 {
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
				
				String requestURI = request.getRequestURI();
				System.out.println(
						"요청 requestURI : " + requestURI  
				);
				
				if ("/favicon.ico".equals(requestURI)) {
					client.close();
					continue;
				}
				
				// 정적인 자원중에서 css 파일에 대한 처리를 추가
				if (requestURI.endsWith(".css")) {
					response.setContentType("text/css");
					PrintWriter out = response.getWriter();
					out.println(
						FileUtil.readFile(requestURI.substring(1))
					);
					out.close();
					response.send();
					client.close();
					continue;
				}
				
				// Image 처리 부분 추가
				if (requestURI.endsWith(".jpg") || requestURI.endsWith(".jpeg")
						 || requestURI.endsWith(".gif") 
						 || requestURI.endsWith(".png")) {
					response.setContentType("image/jpeg");
					byte[] buffer = FileUtil.readByteFile(requestURI.substring(1));
					response.sendByte(buffer);
					client.close();
					continue;
				}
				
				response.setContentType("text/html; charset=utf-8");
				PrintWriter out = response.getWriter();
				
				String html = FileUtil.readFile("WebContent/html/test2.html");
				html = html.replaceAll("#name", "김치찌게");
				System.out.println(html);
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











