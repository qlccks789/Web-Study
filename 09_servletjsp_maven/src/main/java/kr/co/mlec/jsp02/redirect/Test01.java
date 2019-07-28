package kr.co.mlec.jsp02.redirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp02/redirect/test01.do")
public class Test01 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * redirect 방식으로 페이지 이동하기
		 * 
		 * - 응답 객체의 sendRedirect 메서드를 호출
		 * - "/"로 주소가 시작하면 프로젝트 경로를 적어야 한다.
		 * - "/"로 시작하지 않으면 호출된 URL의 마지막을 변경
		 * 
		 * - 주소가 변경된다(2번의 호출과정이 발생)
		 *   응답코드를 302번으로 설정하고
		 *   응답헤더에 location 항목의 값을 
		 *   redirect할 페이지 주소로 설정한다.
		 * - 데이터 공유가 불가능하다. 
		 */
		request.setAttribute("msg", "테스트");
		response.sendRedirect(
			"/09_servletjsp_maven/jsp02/redirect/test01.jsp"
		);
		/*
		response.sendRedirect("test01.jsp");
		*/
	}
	
}











