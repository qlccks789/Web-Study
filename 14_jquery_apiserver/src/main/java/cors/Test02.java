package cors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cors/test02.do")
public class Test02 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("apiserver 요청 들어옴...");
		response.setContentType("text/html; charset=utf-8");
		
		// 헤더값 추가
		response.setHeader("Access-Control-Allow-Origin", "http://localhost");
		
		PrintWriter out = response.getWriter();
		out.println("<h1>apiserver 호출 성공</h1>");
		out.close();
	}
}

















