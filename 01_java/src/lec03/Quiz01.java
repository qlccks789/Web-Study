/*
 *   아래와 같이 출력되는 프로그램을 작성하시오
 *   
 *   나이가 5보다 작으면 무료
 *   11살 까지는 2500원
 *   12살 부터는 5000원 
 *   
 *   나이를 입력하세요 : 3
 *   입장료는 무료입니다.
 *   
 *   나이를 입력하세요 : 7
 *   입장료는 2500원입니다.
 *   
 *   나이를 입력하세요 : 20
 *   입장료는 5000원입니다.
 *   
 *    
 */
package lec03;

import java.util.Scanner;

public class Quiz01 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.printf(
				"입장료는 %s 입니다.", 
				(age <   5) ? "무료" : 
				(age <= 11) ? "2500원" : "5000원"
		);
	}
}
