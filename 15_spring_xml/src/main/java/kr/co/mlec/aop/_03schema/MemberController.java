package kr.co.mlec.aop._03schema;

import java.util.Random;

public class MemberController implements Controller {
	public void service() {
		System.out.println("MemberController 핵심기능 수행 시작");
		Random r = new Random();
		int num1 = r.nextInt(100);
		int num2 = r.nextInt(2);
		System.out.println("num1 / num2 = " + num1 / num2);
		System.out.println("MemberController 핵심기능 수행 종료");
	}
}














