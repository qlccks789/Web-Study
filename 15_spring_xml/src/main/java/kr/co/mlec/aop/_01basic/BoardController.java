package kr.co.mlec.aop._01basic;

import java.util.Random;

public class BoardController implements Controller {
	public void service() {
		try {
			System.out.println("BoardController 핵심기능 수행 시작");
			Random r = new Random();
			int num1 = r.nextInt(100);
			int num2 = r.nextInt(100);
			System.out.println("num1 * num2 = " + num1 * num2);
			System.out.println("BoardController 핵심기능 수행 종료");
		} catch (Exception e) {
			System.out.println("--------------------------");
			System.out.println("실행 중 예외 발생");
			e.printStackTrace();
			System.out.println("--------------------------");
		}		
	}
}














