package kr.co.mlec.jsp02.forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp02/forward/test01.do")
public class Test01 extends HttpServlet {
	public void service(
			HttpServletRequest request, HttpServletResponse response) 
			throws IOException, ServletException {
		System.out.println("test01 서블릿 호출되었음");
		
		/*
		 * forward를 이용한 페이지 이동하기
		 * 
		 * 1. RequestDispatcher 클래스 얻기
		 * 2. 이동할 페이지 주소 설정하기
		 *    "/"로 주소가 시작한다면 웹어플리케이션 경로 생략하고 적는다.
		 *    "/"로 시작하지 않는 경우 "호출한 URL"에서 맨 마지막 부분이 변경됨
		 * 3. RequestDispatcher 클래스의 forward 메서드 호출하기   
		 *    
		 * 주의
		 * 프로젝트 경로 생략하는 경우(/로 시작)
		 * - wex.xml에서 url-pattern에 설정하는 경우
		 * - @WebServlet 에서 경로 설정하는 경우
		 * - forward를 사용하는 경우   
		 */
		RequestDispatcher rd = request.getRequestDispatcher(
				"/jsp02/forward/test01.jsp"
		);
		rd.forward(request, response);
	}
}















