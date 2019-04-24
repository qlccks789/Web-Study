/**
 * 	간접처리방식 이해하기
 * 
 *  throws 예약어를 메서드 선언부에 붙여서 사용한다.
 * 	형태 :
 *  반환타입 메서드명([매개변수...]) throws 넘기줄 예외타입 선언{ }
 *  void call() throws FileNotFoundException{ }
 *  위의 선언의 의미...
 *  call메서드는 FileNotFoundException 이 발생할 수 있는 코드가 있다.
 *  만약 예외가 발생하게 되면 call 메서드는 예외처리를 자신을 호출한 쪽으로 예외를 던진다.
 *  
 */
package lec12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test10 {
	
	static void call2() {
		System.out.println(1 / 0);			// runtime 은 따로 throws 를 던져주지 않아도 자동으로 넘어온다..
	}										// 하지만 throws 를 써주는 이유는 다른사람이 코드를 봤을 때 어떤 예외처리가 있는지 알기위해서
	static void call3() throws ArithmeticException {
		System.out.println(1 / 0);
	}
	
	static void call() throws FileNotFoundException , NullPointerException{   // 예외가 여러개발생한다면 , 로 여러개 나열하면 된다.
//	static void call() throws Exception{   // 둘다 Exception 의 자식이므로 Exception 으로 묶을수도있다.
		Scanner sc = new Scanner(new File("a.txt"));
		String s = null;
		int len = s.length();
	}
	
	static void b() throws FileNotFoundException {
//	static void b() throws Exception {
		call(); 
		
	}
	
	public static void main(String[] args) {
		try {
			call3();
		} catch (ArithmeticException ae) {
			System.out.println("call3에서 에러 발생");
		}
		
		try {
//			call();
			call2();
			call3();
		} catch (Exception e) {
			System.out.println("예외 처리 구문 들어옴");
			e.printStackTrace();
		}
	}
}
