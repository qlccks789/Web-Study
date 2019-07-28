package kr.co.mlec.jsp05.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp05/session/loginform.do")
public class LoginForm extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// jsp05/session/loginform.jsp 호출
		request.getRequestDispatcher("loginform.jsp")
		       .forward(request, response);
	}
}










