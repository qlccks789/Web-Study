/**
 * 서블릿이 호출되기전 사용자 요청 방식이 post 일 경우
 * request 인코딩을 설정하고 서블릿을 호출한다.
 * 
 * 단, 인코딩은 init 메서드에서 어떤 인코딩을 사용 할 지 받는다.
 * 
 * 모든 호출에 대해서 적용할 수 있도록 설정한다.
 */
package kr.co.mlec.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class EncodingFilter implements Filter {
	private String charset;
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// 요청 방식이 POST 방식일 경우 파라미터 인코딩 추가
		HttpServletRequest request = (HttpServletRequest)req;
		if (request.getMethod().equalsIgnoreCase("post")) {
			request.setCharacterEncoding(charset);
		}
		
		chain.doFilter(req, res);
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		charset = filterConfig.getInitParameter("charset");
	}
	
}

















