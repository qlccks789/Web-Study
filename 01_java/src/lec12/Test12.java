/**
 * 	사용자 정의 예외 클래스 이해하기..
 * 
 * 	class MyException extends 예외관련클래스 
 */
package lec12;

import java.util.Random;

public class Test12 {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(45) + 1;
		System.out.println("발생된 로또 번호 : " + num);
		// 예외 발생조건 : 
		// num 이 34보다 크다면 예외를 발생시키고 싶다.
		
		// 문제는... API에 34보다 클때 발생하는 예외는 없다..
		// 직접 로또와 관련된 예의를 만들자...
		if (num > 34) {
			//예외 발생 조건...
			try {
//				throw new LottoException();				
				throw new LottoException(num);				
			} catch (LottoException e) {
				System.out.println("로또 관련 예외 발생");
				System.out.println("에러메세지 : " + e.getMessage());
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	}
}
