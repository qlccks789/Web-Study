package kr.co.mlec.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.mlec.login.vo.MemberVO;

public class AuthFilter implements Filter {
	
	private List<String> list = new ArrayList<>();
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String pages = filterConfig.getInitParameter("pages");
		String[] arr = pages.split(";");
		for (String page : arr) {
//			System.out.println("-" + page.trim() + "-");
			list.add(page.trim());
		}
	}
	
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		
		/*
		 * 사용자가 호출한 페이지  주소가 로그인이 필요한 페이지 인지 확인하고
		 * 만약, 로그인이 필요한 페이지라면 아래의 로그인 체크 로직을 확인한다.
		 */
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		// 프로젝트 경로 포함되어 있음..
		String uri = request.getRequestURI();
		System.out.println("uri : " + uri);
		
		// uri에서 프로젝트 경로 제거하기
		String contextPath = request.getContextPath();
		uri = uri.substring(contextPath.length());
		System.out.println("uri : " + uri);

		// -1 : 로그인 해야만 접근이 가능한 경우의 페이지
		int index = list.indexOf(uri);
		
		// 로그인 체크 : 로그인폼으로 이동
		if (index == -1) {
			HttpSession session = request.getSession();
			MemberVO user = (MemberVO)session.getAttribute("user");
			if (user == null) {
				response.sendRedirect(request.getContextPath() + "/login/loginform.do");
				return;
			}
		}
		
		chain.doFilter(req, res);
	}

}












