/**
 * 서블릿은 하나의 객체만 생성한다.(싱글톤)
 * 
 * 서블릿을 사용자가 최초 요청시
 * - 메모리에 요청한 서블릿 객체가 존재하는지 확인한다.
 * - 존재하지 않는다면 서블릿 객체를 생성(new)한다.
 * - 서블릿의 특정 메서드를 실행한 후 결과를 사용자에게 전송한다.
 * 
 * 서블릿을 사용자가 재 요청시
 * - 메모리에 로딩된 서블릿 객체의 특정 메서드를 실행한 후 결과를 사용자에게 전송한다.
 * 
 * 서블릿의 LifeCycle과 연관된 메서드
 * 최초 요청시 : init(ServletConfig) -> 
 *           service(ServletRequest, ServletResponse) 이 호출
 *           
 * 재 요청시 : service(ServletRequest, ServletResponse) 이 호출           
 */
package kr.co.mlec.servlet.basic;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/servlet/basic/test04.do")
public class Test04 extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init - 서블릿 최초 요청시 호출됨");
	}
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service - 서블릿 호출시 작업 처리 진행");
	}
}













