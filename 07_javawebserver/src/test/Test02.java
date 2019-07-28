package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test/login2")
public class Test02 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		
		req.setCharacterEncoding("utf-8");
		
		String secretKey = req.getHeader("secret-key");
		String secretAuthor = req.getHeader("secret-author");
		System.out.println("secretKey : " + secretKey);
		System.out.println("secretAuthor : " + secretAuthor);
		
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		System.out.println("id : " + id);
		System.out.println("pass : " + pass);
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>성공</h1>");
		out.close();
	}
	
}






















