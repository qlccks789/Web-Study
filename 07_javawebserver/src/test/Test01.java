package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/login")
public class Test01 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		PrintWriter out = response.getWriter();
		out.println("<h1>로그인결과</h1>");
		out.println("<h1>id : " + id + "</h1>");
		out.println("<h1>pass : " + pass + "</h1>");
		String result = ("a".equals(id) && "b".equals(pass)) ? "성공" : "실패";
		out.println("<h1>결과 : " + result + "</h1>");
		out.close();
	}
}








