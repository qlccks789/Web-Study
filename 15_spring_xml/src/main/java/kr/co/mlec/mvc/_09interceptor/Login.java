package kr.co.mlec.mvc._09interceptor;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.mvc._09interceptor.Test")
@RequestMapping("/09interceptor")
public class Login {
	
	@RequestMapping("/loginform.do")
	public void loginform() {}	

	@RequestMapping("/login.do")
	public String login(HttpSession session) {
		Member m = new Member();
		m.setId("hong");
		m.setPassword("1234");
		m.setName("홍길동");
		
		session.setAttribute("user", m);
		
		return "redirect:mypage.do";
	}	

	@RequestMapping("/mypage.do")
	public void mypage() {}
	
	/*
	// 인터셉터 구현 전에 사용
	@RequestMapping("/mypage.do")
	public String mypage(HttpSession session) {
		Member m = (Member)session.getAttribute("user");
		if (m == null) {
			return "redirect:loginform.do";
		}
		return "09interceptor/mypage";
	}
	*/	
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginform.do";
	}	
	
	
}


















