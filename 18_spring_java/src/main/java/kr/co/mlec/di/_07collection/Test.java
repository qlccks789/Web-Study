package kr.co.mlec.di._07collection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext container = new AnnotationConfigApplicationContext(
				Config.class
		);
		
		// id가 menu1인 객체를 얻는다.
		Menu menu = container.getBean(Menu.class);
		menu.printProp();
//		menu.printMap();
//		menu.printSet();
//		menu.printList();
	}
}














