package kr.co.mlec.mvc._06share;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller("kr.co.mlec.mvc._06share.Test")
@RequestMapping("/06share")
public class Test {
	
	@RequestMapping("/test1.do")
	public void test01(HttpServletRequest request, Member member) {
		request.setAttribute("member", member);
	}
	
	/*
	 * 일반 VO 개념의 클래스를 매개변수에 선언한 경우 스프링에서 해당 클래스를 자동 공유한다.
	 * 클래스이름의 첫글자를 소문자로 변경한 이름으로 공유(Member -> member)
	 */
	@RequestMapping("/test2.do")
	public void test02(Member member) {}

	/*
	 * @ModelAttribute를 파라미터에 사용하면 화면에 공유되는 이름을 지정할 수 있다.
	 */
	@RequestMapping("/test3.do")
	public void test03(@ModelAttribute("m") Member member) {}

	@RequestMapping("/test4.do")
	public void test04(Member member, Model model) {
		model.addAttribute("m", member);
		model.addAttribute("msg", "model을 이용한 데이터 공유");
	}
	
	@RequestMapping("/test5.do")
	public void test05(Member member, Map<String, Object> map) {
		map.put("m", member);
		map.put("msg", "map을 이용한 데이터 공유");
	}
	
	@RequestMapping("/test6.do")
	public String test06(RedirectAttributes attr) {
		attr.addFlashAttribute("msg", "게시물이 등록되었습니다.");
		attr.addAttribute("where", "write");
		return "redirect:/06share/test7.do";
	}
	
	@RequestMapping("/test7.do")
	public void test7() {}
	
}


















