/**
 * Filter 기능을 수행하는 클래스가 되기 위한 조건
 * 
 * - Filter 인터페이스를 상속
 * 
 * - 필터를 특정 서블릿 또는 다수의 서블릿, JSP에 연결해서 사용하기 위해서 설정
 *   어노테이션 또는 xml 설정..
 *   
 * - 주요 메서드
 *   init : 필터가 메모리에 올라갈때 한번만 수행
 *   doFilter : 호출시마다 실행  
 */
package kr.co.mlec.jsp07.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class One implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("One - init 메서드 호출");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("One - doFilter start");
		// 다음 필터 또는 서블릿(jsp) 호출
		chain.doFilter(req, res);
		System.out.println("One - doFilter end");
	}

}

















