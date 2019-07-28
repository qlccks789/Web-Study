package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test07.do")
public class Test07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GET 메서드 호출 성공...");
		String msg = request.getParameter("msg");
		System.out.println("msg : " + msg);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 방식일 경우에는 한글 디코딩 작업을 해야한다.
		// 파라미터 한글 처리 케릭터셋 지정
		request.setCharacterEncoding("utf-8");

		System.out.println("POST 메서드 호출 성공...");
		String msg = request.getParameter("msg");
		System.out.println("msg : " + msg);
	}
		
}











