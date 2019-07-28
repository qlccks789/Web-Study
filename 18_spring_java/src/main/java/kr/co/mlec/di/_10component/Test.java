package kr.co.mlec.di._10component;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext container = new AnnotationConfigApplicationContext(
				Config.class
		);
		Menu menu = container.getBean(Menu.class);
		menu.print();
	}
}














