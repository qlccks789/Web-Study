package kr.co.mlec.mvc._03param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("kr.co.mlec.mvc._03param.Test")
@RequestMapping("/param")
public class Test {
	@RequestMapping("/test1.do")
	public String test01(HttpServletRequest request) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		return "redirect:/index03.jsp";
	}

	@RequestMapping("/test2.do")
	public String test02(
			@RequestParam("id") String id, 
			@RequestParam("password") String pass, 
			@RequestParam("name") String name
			) {
		System.out.println("id : " + id);
		System.out.println("password : " + pass);
		System.out.println("name : " + name);
		return "redirect:/index03.jsp";
	}
	
	@RequestMapping("/test3.do")
	public String test03(
			@RequestParam("id") String id, 
			@RequestParam("password") String pass, 
			@RequestParam(value="name", required=false) String name
			) {
		System.out.println("id : " + id);
		System.out.println("password : " + pass);
		System.out.println("name : " + name);
		return "redirect:/index03.jsp";
	}
	
	@RequestMapping("/test4.do")
	public String test04(
			@RequestParam(value="id", defaultValue="hong") String id,
			@RequestParam("password") String pass, 
			@RequestParam(value="name", required=false) String name
			) {
		System.out.println("id : " + id);
		System.out.println("password : " + pass);
		System.out.println("name : " + name);
		return "redirect:/index03.jsp";
	}

	@RequestMapping("/test5.do")
//	public String test05(String id, String password, String name, int age) {
	public String test05(String id, String password, String name, Integer age) {
		System.out.println("id : " + id);
		System.out.println("password : " + password);
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		return "redirect:/index03.jsp";
	}

	@RequestMapping("/test6.do")
	public String test06(Member member) {
		System.out.println("id : " + member.getId());
		System.out.println("password : " + member.getPassword());
		System.out.println("name : " + member.getName());
		return "redirect:/index03.jsp";
	}
	
	@RequestMapping("/test7.do")
	public String test07(Member member) {
		System.out.println("id : " + member.getId());
		System.out.println("password : " + member.getPassword());
		System.out.println("name : " + member.getName());
		System.out.println("birthDate : " + member.getBirthDate());
		return "redirect:/index03.jsp";
	}
	
}















