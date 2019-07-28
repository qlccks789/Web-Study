package kr.co.mlec.di._02basic;

public class Test {
	public static void main(String[] args) {
		// 객체간의 의존성이 깊은 형태
		// 의존하는 객체가 변경하면 코드의 변경사항이 발생하게 된다.
		Sand sand = new HamSand();
		sand.info();
	}
}
