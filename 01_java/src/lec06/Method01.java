package lec06;

import java.util.Random;

// 기능(메서드)을 가지고 있는 클래스
// 매개변수 테스트용..
/*
 *   메서드 선언 구문
 *   
 *   반환타입 메서드명([매개변수, ..]) {
 *   	기능을 수행하기 위한 명령어들...
 *   }
 */

public class Method01 {
	// 선언.. 
	// 호출 : 이름(매개변수에 들어갈 값) -> method01()
	void method01() {
		System.out.println(
				"Method01 클래스의 method01 메서드"
		);
		// 실행이 끝나면 메서드를 호출한 쪽으로 넘어간다.
	}

	// 호출 : 이름(매개변수에 들어갈 값) -> method02(10)
	void method02(int i) {
		System.out.println("method02 메서드 : " + i);
	}

	// 호출 : 이름(매개변수에 들어갈 값) -> method03("a")
	void method03(String s) {
		// s의 값으로 : 메서드 호출성공
		System.out.println("method03 메서드 : " + s);
	}
	
	void method04(String s, int i) {
		System.out.printf(
				"method04 호출 성공 : %s %d%n", s, i);
	}

	void method05(String s, String s2) {
		System.out.printf("method05 호출 성공 : %s, %s %n", s, s2);
	}
	
	
	void method06(int[] arr, int i ) {		// 참조형이던 기본형이던 타입이 같으면 받을수 있다.  // int[] arr, int i  -> ( new int[], 10 )
		System.out.println("method06 호출됨");
	}

	// Random r = new Random();
	void method07(Random r) {
		System.out.println("method07 : " + r.nextInt(5));
	}


	void method08(JeBal jebal) {   // 선언 
		System.out.println("method08");	// 호출
		jebal.msg("성공해줘~");			// 호출
	}
	
	
		
	
}

class JeBal  {
	void msg(String data) {
		System.out.println("JeBal : " + data);
	}
}















