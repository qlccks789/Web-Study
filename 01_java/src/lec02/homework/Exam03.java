/*
	아래와 같이 출력하는 프로그램을 작성하시오   
	
	환율 계산 : 1달러당 1088.11 원
	출력 시 소수점 아래 2자리만 출력 

	출력형식 >
	   	
	달러를 입력하시오 : 30    
	원화 : 32643.30원	
	
	달러를 입력하시오 : 100      
	원화 : 108811.00원  
 */
package lec02.homework;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {
		// 숫자와 숫자 사이에 "_"를 사용 할 수 있음.
		final double WON = 1_088.11;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("달러를 입력하시오 :");
		int daller = Integer.parseInt(sc.nextLine());

		// 1달러당 환산할 원화 가격
		System.out.printf("원화 : %.2f원", daller * WON);
	}
}







