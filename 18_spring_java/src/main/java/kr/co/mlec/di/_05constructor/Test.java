package kr.co.mlec.di._05constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext container = new AnnotationConfigApplicationContext(
				Config.class
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














