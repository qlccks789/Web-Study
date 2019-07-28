// forward를 활용한 데이터 공유하기
package kr.co.mlec.jsp02.forward;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp02/forward/test02.do")
public class Test02 extends HttpServlet {
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// jsp 페이지에 공유할 데이터
		String msg = "점심은 메이찬!!";
		List<String> menu = new ArrayList<>();
		menu.add("짜장면");
		menu.add("짬봉");
		menu.add("볶음밥");
		
		// jsp 페이지에서 사용하기 위해 데이터 공유(request)
		request.setAttribute("msg", msg);
		request.setAttribute("menu", menu);
		
		// jsp 페이지로 이동하기
		// /09_servletjsp_maven/jsp02/forward/test02.do
		// /09_servletjsp_maven/jsp02/forward/test02.jsp
		RequestDispatcher rd = request.getRequestDispatcher(
				"test02.jsp"
		);
		rd.forward(request, response);
	}
}









