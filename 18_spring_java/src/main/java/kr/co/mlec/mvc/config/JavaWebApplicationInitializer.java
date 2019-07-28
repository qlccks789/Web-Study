package kr.co.mlec.mvc.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class JavaWebApplicationInitializer implements WebApplicationInitializer {
	
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("JavaWebApplicationInitializer-----");
		
		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext();
		servletAppContext.register(Config.class);
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext);
		
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", dispatcherServlet);
		servlet.setLoadOnStartup(1);
		servlet.addMapping("*.do");

		FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		filter.setInitParameter("encoding", "UTF-8");
		/*
		dispatcherTypes- 필터 매핑 디스패처 유형, null의 경우는 기본적으로 DispatcherType.REQUEST 가 사용
		isMatchAfter - 주어진 필터 매핑 선언 된 필터 매핑 후에 일치해야하는 경우는 true,이 FilterRegistration가 가져온 ServletContext에서 선언 된 필터 매핑 전에 일치하여야 않은 경우는 false
		servletNames - 필터 매핑 서블릿 이름
		*/
		filter.addMappingForUrlPatterns(null, false, "/*");
		
		/*
		dispatcherTypes- 필터 매핑 디스패처 유형, null의 경우는 기본적으로 DispatcherType.REQUEST 가 사용
		isMatchAfter - 주어진 필터 매핑 선언 된 필터 매핑 후에 일치해야하는 경우는 true,이 FilterRegistration가 가져온 ServletContext에서 선언 된 필터 매핑 전에 일치하여야 않은 경우는 false
		servletNames - 필터 매핑 서블릿 이름
		urlPatterns - 필터 매핑 URL 패턴
		*/
//		filter.addMappingForServletNames(null, false, "dispatcher");
		
	}
	
}
