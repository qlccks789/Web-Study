package kr.co.mlec.jsp05.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/jsp05/session/test.do")
public class Test extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		// 세션 가져오기
		HttpSession session = request.getSession();
		String id = session.getId();
		// 세션의 유지시간 3초로 설정
		session.setMaxInactiveInterval(3);
		
		out.println("<h1>JSESSIONID : " + id + "</h1>");
		out.close();
	}
	
}










