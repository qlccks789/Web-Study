/**
 * 어노테이션을 이용한 서블릿 호출하기
 * 주의할 점 : URI 설정 시 맨 앞에 "/" 를 붙인다.
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test03.do")
public class Test03 extends HttpServlet {
	public void service(
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// 브라우저에게 전송하는 내용이 어떤 것인지 알려준다.
		response.setContentType("text/html; charset=utf-8");
		
		// 출력하기 위해서 ..
		PrintWriter out = response.getWriter();
		out.println("<h1>어노테이션을 이용한 호출</h1>");
		out.close();
	}
}













