package lec03;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 *   if (조건식) 
		 *   	참일 경우 수행할 문장
		 *   else 
		 *   	조건식을 만족하지 않는 경우 수행할 문장
		 *   
		 *   
		 *   if (조건식) {
		 *   	참일 경우 수행할 문장들..
		 *   } else {
		 *   	조건식을 만족하지 않는 경우 수행할 문장들
		 *   }
		 *   
		 */
		int a = 5;
		// a가 5일 경우에는 "a는 5가 맞습니다.
		//       아닐 경우에는 "a는 5가 아닙니다."
		if (a == 5) {
			System.out.println("a는 5가 맞습니다.");
		} else {
			System.out.println("a는 5가 아닙니다.");
		}
		
		// 랜덤객체를 만든다.
		Random r = new Random();
		
		int num1 = r.nextInt(10) + 1;  // num1의 값이 1 부터 10사이의 숫자가 될수 있도록 코딩
		int num2 = r.nextInt(10) + 1;
		// num1, num2 중에서 큰 수를 max에 대입하는 코딩 작성
		/*
		int max = (num1 > num2) ? num1 : num2;
		*/
		// if 문을 이용한 방식으로 변경한다.
		/*
		int max;
		
		if (num1 > num2) {
			max = num1;
		} else {
			max = num2;
		}
		*/
		
		int max = num1;
		if (num1 < num2) {
			max = num2;
		}
		System.out.println("생성된 num1 : " + num1);
		System.out.println("생성된 num2 : " + num2);
		System.out.println("max : " + max);
	}
}













