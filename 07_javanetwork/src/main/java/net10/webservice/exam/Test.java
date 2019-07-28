package net10.webservice.exam;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import server.FileUtil;
import server.HttpServlet;
import server.HttpServletRequest;
import server.HttpServletResponse;

public class Test {
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
				if (requestURI == null) {
					client.close();
					continue;
				}
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
				
				// 사용자 요청 URI 에 대해서 별도의 작업 처리를 진행하게 코드 작성
				HttpServlet control = null;
				switch (requestURI) {
				case "/login/loginform.do":  // 사용자에게 로그인 폼을 전송
					control = new LoginFormController();
					break;
				case "/login/login.do":  // 로그인 처리 요청 ..
					control = new LoginController();
					break;
				}
				if (control == null) {
					response.setContentType("text/html; charset=utf-8");
					PrintWriter out = response.getWriter();
					out.println("<h1>404 - FileNotFound</h1>");
					out.close();
				} else {
					control.service(request, response);
				}
				
				response.send();
				client.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
