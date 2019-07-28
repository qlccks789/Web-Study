package kr.co.mlec.mvc._02requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("kr.co.mlec.mvc._02requestmapping.Test")
@RequestMapping("/requestmapping")
public class Test {
	@RequestMapping("/test1.do")
	public String test01() {
		System.out.println("test01 호출됨..");
		return "redirect:/index02.jsp";
	}

	// 앞의 "/"를 생략할 수 있다.
	@RequestMapping("test2.do")
	public String test02() {
		System.out.println("test02 호출됨..");
		return "redirect:/index02.jsp";
	}
	
//	@RequestMapping(value="test3.do")
	@RequestMapping(path="test3.do")
	public String test03() {
		System.out.println("test03 호출됨..");
		return "redirect:/index02.jsp";
	}
	
	@RequestMapping(value = {"test4.do", "test5.do"})
	public String test04() {
		System.out.println("test4.do or test05.do 호출됨..");
		return "redirect:/index02.jsp";
	}	

//	@RequestMapping(value="test6.do", method=RequestMethod.GET)
	@GetMapping("test6.do")
	public String test06() {
		System.out.println("test06 GET 호출됨..");
		return "redirect:/index02.jsp";
	}

//	@RequestMapping(value="test6.do", method=RequestMethod.POST)
	@PostMapping("test6.do")
	public String test07() {
		System.out.println("test6.do POST 호출됨..");
		return "redirect:/index02.jsp";
	}
	
	@RequestMapping(value="test8.do", consumes="application/json")
	public String test08() {
		System.out.println("application/json 호출됨..");
		return "redirect:/index02.jsp";
	}
	
	@RequestMapping(value="test8.do", consumes="application/x-www-form-urlencoded")
	public String test09() {
		System.out.println("application/x-www-form-urlencoded 호출됨..");
		return "redirect:/index02.jsp";
	}
	
	@RequestMapping(value="test8.do")
	public String test10() {
		System.out.println("이외의 호출의 경우.");
		return "redirect:/index02.jsp";
	}
	
}















