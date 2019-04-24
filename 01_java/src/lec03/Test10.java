/*
 *   수를 입력 : 3

 *   입력된 수에 10을 곱한 값 : 30
 *   
 *   수를 입력 : 5
 *   입력된 수에 10을 곱한 값 : 50
 */
package lec03;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		/*
		 수를 입력 : 3
     	입력된 수에 10을 곱한 값 : 30
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("수를 입력(종료 : -1) : ");
			int input = Integer.parseInt(sc.nextLine());
			// input이 -1이라면 종료시킨다.
			if (input == -1) break;
//			if (input == -1) {
//				// break : 반복문을 빠져나온다.
//				break;
//			}
			System.out.println(
				"입력된 수에 10을 곱한 값 : " + input * 10 
			);
		}
		System.out.println("반복문 빠져나옴...");
	}
}







