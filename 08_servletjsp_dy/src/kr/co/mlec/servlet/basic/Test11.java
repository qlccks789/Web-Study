package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8000/08_servletjsp_dy/servlet/basic/test11

@WebServlet("/servlet/basic/test11.do")
public class Test11 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 객체 주요 메서드");
		System.out.println("웹 어플리케이션(웹프로젝트, 웹컨텍스트) 경로 : " + request.getContextPath());
		System.out.println("요청 방식 : " + request.getMethod());
		System.out.println("요청 URI : " + request.getRequestURI());	
		System.out.println("요청 URL : " + request.getRequestURL());	
		
	}
	
}












