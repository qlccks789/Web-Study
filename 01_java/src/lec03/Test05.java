package lec03;

import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		Random r = new Random();
		/*
		 *   num이 5보다 크다면 
		 *   "5보다 큽니다"
		 *   "5보다 작습니다"
		 */
		int num = r.nextInt(10) + 1;
		/*
		if (num > 5) {
			System.out.println("5보다 큽니다");
		} else {
			System.out.println("5보다 작습니다");
		}
		*/
		
		/*
		 *   num이 5보다 크다면 
		 *   "5보다 큽니다"
		 *   "5입니다"
		 *   "5보다 작습니다"
		 *   
		 *   1. num이 5보다 큰지 비교한다.
		 *     1-1. 크면 메세지 출력
		 *     1-2. 크지 않다면 
		 *          1-2-1. num이 5와 같은지 비교한다.
		 *            같다면 "같다는 메세지 출력"
		 *            아니면 "작다 메세지 출력"
		 */
		if (num > 5) {
			System.out.println("5보다 큽니다");
		} else {
			if (num == 5) {
				System.out.println("5입니다.");
			} else {
				System.out.println("5보다 작습니다.");
			}
		}
		
		// 위의 코드는 조건이 많을 수록 코드 가독성에 문제가 생긴다
		System.out.println("num : " + num);
		/*
		if (num > 5) {
			System.out.println("5보다 큽니다");
		} else if (num == 5) {
			System.out.println("5입니다.");
		} else {
			System.out.println("5보다 작습니다.");
		}
		*/
		
		// 코드 리펙토링..
		String result;
		if (num > 5) {
			result = "5보다 큽니다";
		} else if (num == 5) {
			result = "5입니다.";
		} else {
			result = "5보다 작습니다.";
		}
		System.out.println(result);
		
	}
}














