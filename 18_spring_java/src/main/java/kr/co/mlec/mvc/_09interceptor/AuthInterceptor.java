package kr.co.mlec.mvc._09interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		Member m = (Member)session.getAttribute("user");
		if (m != null) {
			return true;
		}
		
		response.sendRedirect("loginform.do");
		return false;
	}
	
}
















