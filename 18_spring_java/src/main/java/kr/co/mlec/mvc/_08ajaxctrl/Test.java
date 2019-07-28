package kr.co.mlec.mvc._08ajaxctrl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("kr.co.mlec.mvc._08ajaxctrl.Test")
@RequestMapping("/08ajaxctrl")
public class Test {
	
	@RequestMapping("/test1.do")
	public String test01() {
		return "success, 성공";
	}	
	
	@RequestMapping("/test2.do")
	public Map<String, String> test02() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "sbc");
		result.put("name", "hong");
		result.put("addr", "서울");
		return result;
	}	
	
	@RequestMapping("/test3.do")
	public Member test03() {
		Member m = new Member();
		m.setId("sbc");
		m.setName("hong");
		m.setPassword("1234");
		return m;
	}	
	
	@RequestMapping("/test4.do")
	public List<Member> test04() {
		List<Member> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			Member m = new Member();
			m.setId("sbc" + i);
			m.setName("hong" + i);
			m.setPassword("1234" + i);
			
			list.add(m);
		}
		return list;
	}	
	
	/*
	 *    ResponseEntity 반환
	 *    
	 *    상태코드 + 데이터, 헤더값 등을 추가 가능하다.
	 * 
	 * 
	 */
	@RequestMapping("/test5.do")
	public ResponseEntity<String> test05() {
		
		int i = 10;
		if (i < 20) {
			return new ResponseEntity<String>("서버 문제 발생", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		return new ResponseEntity<String>("success, 성공", HttpStatus.OK);
	}	
	
	/*
	 *     /board/100  GET     2번 게시물을 조회
	 *     /board/2  DELETE  2번 게시물을  삭제
	 *     /board/2  PUT     2번 게시물을  수정
	 */
	@RequestMapping("/board/{no}.do")
//	public String test06(@PathVariable("no") int no) {
	public String test06(@PathVariable int no) {
		return no + "번 들어옴";
	}
	
}


















