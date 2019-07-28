/**
 *   고객의 요구사항 발생
 *   
 *   페이지가 늦게 뜹니다..
 *   2초이상 걸리는 페이지들의 목록을 파일에 저장해서 보고해 주세요...
 */
package kr.co.mlec.jsp07.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ExeTimeFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		// 사용자 요청 페이지 주소
		HttpServletRequest request = (HttpServletRequest)req;
		String uri = request.getRequestURI();
		
		long s = System.currentTimeMillis();
		
		chain.doFilter(req, res);
		
		double time = (System.currentTimeMillis() - s) / 1000d;
		
		System.out.printf("%s 페이지 실행시간 : %.4f초 걸렸음%n", uri, time);
	}
	
}










