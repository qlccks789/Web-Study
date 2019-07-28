package kr.co.mlec.di._07collection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 생성자 인젝션 방식 살펴보기
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				"config/di/07collection/test.xml"
		);
		
		// id가 menu1인 객체를 얻는다.
		Menu menu = container.getBean(Menu.class);
		menu.printProp();
//		menu.printMap();
//		menu.printSet();
//		menu.printList();
	}
}














