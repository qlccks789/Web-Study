package kr.co.mlec.test.controller;

import org.springframework.web.WebConstants;
import org.springframework.web.annotation.Controller;
import org.springframework.web.annotation.RequestMapping;

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
		
		return 	WebConstants.REDIRECT + "/test/index.do";
	}
	
}






