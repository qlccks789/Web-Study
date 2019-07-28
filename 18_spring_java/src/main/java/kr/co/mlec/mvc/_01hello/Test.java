package kr.co.mlec.mvc._01hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("kr.co.mlec.mvc._01hello.Test")
public class Test {
	@RequestMapping("/hello/hello.do")
	public ModelAndView hello() {
		// <mvc:jsp prefix="/WEB-INF/jsp/" suffix=".jsp" />
		ModelAndView mav = new ModelAndView("01hello/hello");
		mav.addObject("msg", "hi 스프링 mvc~~");
		return mav;
	}
}















