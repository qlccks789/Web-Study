package basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/basic/exam02.do")
public class Exam02 extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		
		Map<String, String> result = new HashMap<>();
		result.put("msg", request.getParameter("msg"));

		PrintWriter out = response.getWriter();
		// {"msg": "aaaa"}
		out.println(new Gson().toJson(result));  
		out.close();
	}
	
}















