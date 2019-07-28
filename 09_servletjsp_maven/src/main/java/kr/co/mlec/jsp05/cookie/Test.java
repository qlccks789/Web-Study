/**
 * 쿠키의 특징
 * 
 * 1. 정보 저장이 사용자 컴퓨터 쪽에 ..(브라우저 별로 관리)
 * 2. 정보 저장의 최소 유효시간 : 브라우저가 켜 있는 동안
 * 3. 유효 시간을 사용자가 지정 할 수 있다.
 * 4. 한 사이트에서 설정될 수 있는 쿠키의 수는 20개
 * 5. 한 쿠키의 크기는 4K를 넘을 수 없다.
 * 6. 전체 쿠키의 수는 300개까지 가능하다.
 * 7. 쿠키에 저장되는 값은 문자열만 가능하다.(한글 직접 저장 불가능, 인코딩 후 가능함)
 * 
 * 8. 쿠키 API
 * 	  : 생성 (이름, 값) - Cookie c = new Cookie("이름", "값");
 *    : 응답시 쿠키 전송  - response.addCookie( c );
 *    : 쿠키 정보 확인
 *      Cookie[] cookies = request.getCookies();
 *    : Cookie 클래스의 주요 메서드
 *      getName()
 *      getValue()  
 */
package kr.co.mlec.jsp05.cookie;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp05/cookie/test.do")
public class Test extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		name = URLEncoder.encode(name, "utf-8");
		String value = request.getParameter("value");
		// 쿠키 생성
		Cookie c = new Cookie(name, value);
		
		// 쿠키를 전송하는 패스 설정
		c.setPath("/");
		
		// 유효시간 설정 : 초
		c.setMaxAge(60 * 60 * 24);
		
		// 사용자에게 응답시 전송
		response.addCookie(c);
		
		response.sendRedirect("test01.jsp");
	}
}















