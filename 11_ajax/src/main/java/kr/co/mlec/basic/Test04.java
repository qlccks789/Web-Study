package kr.co.mlec.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basic/test04.do")
public class Test04 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf-8");
		String msg = request.getParameter("msg");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>서블릿 응답 완료</h2>");
		out.println("<h2>msg : " + msg + "</h2>");
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String msg = request.getParameter("msg");
		String name = request.getParameter("name");
		
		PrintWriter out = response.getWriter();
		out.println("<h2>POST 서블릿 응답 완료</h2>");
		out.println("<h2>msg : " + msg + "</h2>");
		out.println("<h2>name : " + name + "</h2>");
		out.close();
	}

}














