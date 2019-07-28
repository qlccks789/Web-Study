package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/basic/test08.do")
public class Test08 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// radio 선택값 확인하기
		String sms = request.getParameter("sms");
		System.out.println("sms : " + sms);
		
		// test08.do?dinner=1&dinner=2&dinner=3
		// 제일 앞에 있는 값을 반환한다.
		/*
		String dinner = request.getParameter("dinner");
		System.out.println("dinner : " + dinner);
		*/
		// 동일한 이름으로 여러개의 파라미터가 넘어오는 경우(체크박스)
		String[] dinners = request.getParameterValues("dinner");
		System.out.println("선택한 dinner");
		System.out.println("----------------------");
		if (dinners != null) {
			for (String dinner : dinners) {
				System.out.println(dinner);
			}
		} else {
			System.out.println("선택된 항목이 없습니다.");
		}
		System.out.println("----------------------");
	}
}













