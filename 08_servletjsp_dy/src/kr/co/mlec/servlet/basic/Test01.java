/**
 * 서버사이드(server side) : 서버에서 실행한 다음 결과를 클라이언트로 전송
 * - servlet, jsp, php, asp, javascript(nodejs)
 * 
 * 클라이언트 사이드(client side) : 클라이언트 브라우저에서 실행
 * - html, css, javascript, image.. 
 * 
 * 서블릿 : server + applet(브라우저에서 동작하는 자바 클래스)
 * - 자바다..(서버에서 실행되는 자바)
 * - 서블릿이 되기 위해서는 반드시 Servlet 인터페이스 타입이어야 한다.
 *   Servlet(인) <- GenericServlet(추) <- HttpServlet
 *   
 * - 일반적으로 서블릿을 구현할 때   HTTP 프로토콜에 대한 기능을 처리한 HttpServlet
 *   상속받아 구현한다.
 *   
 *   HttpServlet 구현시의 유의할 점
 *   1. 메서드 중에서 아래의 메서드 중에 하나를 반드시 구현해야 한다.
 *      - service(ServletReqeust, ServletResponse)
 *      - service(HttpServletReqeust, HttpServletResponse)
 *      - doGet  (HttpServletReqeust, HttpServletResponse)
 *      - doPost (HttpServletReqeust, HttpServletResponse)
 *   2. doGet -> get 방식 요청만 처리, doPost -> post 방식 요청만 처리
 *      service -> get, post 두가지 모두 처리  
 *      
 *   Tomcat 웹서버에서 사용자가 만든 클래스를 특정 URI와 연결하는 방법
 *   - web.xml 에 정보를 등록
 *   - @WebServlet 어노테이션을 활용
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web.xml 을 이용해서 정보를 등록처리하기..
// http://localhost:8000/08_servletjsp_dy/servlet/basic/test01.do
public class Test01 extends HttpServlet {
	@Override
	public void service(
			HttpServletRequest request, 
			HttpServletResponse response) throws IOException, ServletException {
		System.out.println("첫번째 서블릿 호출됨...");
	}
}
















