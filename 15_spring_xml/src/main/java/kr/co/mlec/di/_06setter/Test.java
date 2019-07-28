package kr.co.mlec.di._06setter;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// 생성자 인젝션 방식 살펴보기
		AbstractApplicationContext container = new GenericXmlApplicationContext(
				"config/di/06setter/test.xml"
//				"config/di/06setter/test2.xml"
		);
		
		// id가 menu1인 객체를 얻는다.
		Menu menu1 = container.getBean("menu1", Menu.class);
		menu1.info();

		Menu menu2 = container.getBean("menu2", Menu.class);
		menu2.info();
		
		Menu menu3 = container.getBean("menu3", Menu.class);
		menu3.info();
	}
}














