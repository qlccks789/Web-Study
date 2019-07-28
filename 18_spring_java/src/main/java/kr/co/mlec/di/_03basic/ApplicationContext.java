package kr.co.mlec.di._03basic;

import java.util.HashMap;
import java.util.Map;

// 스프링에서는 컨테이너 개념이다.
public class ApplicationContext {
	private Map<String, Sand> map = new HashMap<>();
	
	public ApplicationContext() {
		// 객체의 관리 정보 : XML 또는 JAVA, Annotation
		map.put("ham", new HamSand());
	}
	
	// DL : 객체를 찾는 방식 제공
	public Sand getBean(String name) {
		return map.get(name);
	}
}














