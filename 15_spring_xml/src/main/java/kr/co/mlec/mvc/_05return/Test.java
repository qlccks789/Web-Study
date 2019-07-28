package kr.co.mlec.mvc._05return;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;

@Controller("kr.co.mlec.mvc._05return.Test")
@RequestMapping("/05return")
public class Test {
	
	@RequestMapping("/test1.do")
	public String test01() {
		return "05return/test1";
	}

	/*
		/05return/test2.do
		/05return/test2
		05return/test2
		/WEB-INF/jsp/05return/test2.jsp
	 */
	@RequestMapping("/test2.do")
	public void test2() {}
	
	@RequestMapping("/test3.do")
	public ModelAndView test3(ModelAndView mav) {
		mav.setViewName("05return/test3");
		return mav;
	}
	
	@RequestMapping("/test4.do")
	public View test4() {
		return new InternalResourceView("/WEB-INF/jsp/05return/test4.jsp");
	}
	
}















