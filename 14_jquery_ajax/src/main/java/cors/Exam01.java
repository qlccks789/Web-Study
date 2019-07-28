package cors;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cors/test01.do")
public class Exam01 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		// apiserver 서버의 데이터를 요청
		String page = "http://localhost:9999/14_jquery_apiserver/cors/test01.do";
		URL url = new URL(page);
		InputStream in = url.openStream();
		Scanner sc = new Scanner(in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNextLine()) {
			sb.append(sc.nextLine());
		}
		PrintWriter out = response.getWriter();
		out.println(sb.toString());
		out.close();
	}
	
}















