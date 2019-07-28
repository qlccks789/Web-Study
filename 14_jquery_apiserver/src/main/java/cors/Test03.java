package cors;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cors/test03.do")
public class Test03 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("apiserver 요청 들어옴...");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String cb = request.getParameter("callback");
		if (cb != null) {
			out.println(cb + "('<h1>Ajax callback 호출 성공~</h1>')");
		} else {
			out.println("cb('<h1>Ajax callback 호출 성공~</h1>')");			
		}
		out.close();
	}
}

















