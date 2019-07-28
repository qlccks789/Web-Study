/**
 * 사용자 화면 출력 : 응답..
 * 
 * PrintWriter  response.getWriter() : 문자 단위의 처리(일반텍스트)
 * OutputStream response.getOutputStream() : 바이트 단위의 출력(이미지, ..)
 * 
 * response.setContentType("문서타입")
 * response.setContentType("문서타입; charset=utf-8")
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test05.do")
public class Test05 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		// 한글 처리 안됨..
//		response.setContentType("text/html");
		
		// 한글처리 추가됨..
//		response.setContentType("text/html; charset=utf-8");
//		response.setContentType("text/plain; charset=utf-8");
//		response.setContentType("text/xml; charset=utf-8");
		// 브라우저가 전송한 문서를 다운로드 : 타입을 모를때..
		response.setContentType("taxt/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>성공 - success</h1>");
//		out.println("<family><father>홍길동</father></family>");
		out.close();
	}
}




























