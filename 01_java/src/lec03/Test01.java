/*
 *   랜덤한 숫자를 뽑자...
 *   
 *   참조형 클래스 사용...
 *   
 *   String, System, Integer, Double
 *   
 *   Random
 */
package lec03;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		// Random cannot be resolved to a type
		// 참조형의 값을 만드는 방식
		// new Random();   메서드의 이름이 클래스 이름과 같다(생성자)
		// 랜덤한 값을 뽑을 수 있는 기능을 가지고 있는 클래스를 사용한다.
		Random ran = new Random();
		// 랜덤한 정수를 달라고 요청하는 작업...
		int num = ran.nextInt(5);  // 0 ~ 5-1
		System.out.println(num);
		
		// 랜덤한 숫자를 뽑아서 화면에 출력하시오
		// num2는 1 - 10 사이의 숫자가 나오도록 코딩을 작성
		int num2 = ran.nextInt(10) + 1; // 0 - 9
		System.out.println(num2);

		// num3는 2 - 9 사이의 숫자가 나오도록 코딩을 작성
		int num3 = ran.nextInt(8) + 2; // 0 - 7
		System.out.println(num3);
		
		// num4는 11 - 19 사이의 숫자가 나오도록 코딩을 작성
		int num4 = ran.nextInt(9) + 11; // 0 - 8
		System.out.println(num3);

		// num5는 -10 ~ 10 사이의 숫자가 나오도록 코딩을 작성
		int num5 = ran.nextInt(21) - 10; // 0 - 8
		System.out.println(num3);
	}
}

















