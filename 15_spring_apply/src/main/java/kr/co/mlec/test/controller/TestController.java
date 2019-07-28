package kr.co.mlec.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import kr.co.mlec.repository.domain.Test;

@Controller
public class TestController {
	@RequestMapping("/test/index.do")
	public void index() {}
	
	// 메서드 정의
	@RequestMapping("/test/test-process.do")
	public String process(Test test) {
//	public String process(HttpServletRequest request) {
		System.out.println("process 메서드 호출되었음");
		// 화면에서 넘겨준 id와 name을 출력한다.
		System.out.println(test);
		
		return 	UrlBasedViewResolver.REDIRECT_URL_PREFIX + "/test/index.do";
	}
	
}



















