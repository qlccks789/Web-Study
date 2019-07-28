package kr.co.mlec.di._03basic;

public class Test {
	public static void main(String[] args) {
		ApplicationContext container = new ApplicationContext();
		Sand sand = container.getBean("ham");
		sand.info();
	}
}
