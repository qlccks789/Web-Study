package net10.webservice.exam;

import java.io.PrintWriter;

import server.FileUtil;
import server.HttpServlet;
import server.HttpServletRequest;
import server.HttpServletResponse;

public class LoginFormController extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String html = FileUtil.readFile(
				"WebContent/html/loginform.html"
		);
		out.println(html);
		out.close();
	}
}







