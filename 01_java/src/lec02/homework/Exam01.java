/*
	아래와 같이 출력하는 프로그램을 작성하시오   
	출력형식 >
  
	초를 입력하시오 : 3661  
	3661초는 1시간 1분 1초 입니다.
 */
package lec02.homework;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int HOUR_SEC = 60 * 60;
		System.out.print("초를 입력하시오 : ");
		int time = Integer.parseInt(sc.nextLine());
		
		System.out.printf("입력된 %d초는 %d시간 %d분 %d초 입니다.\n",
				          time,
				          time / HOUR_SEC,
				          (time % HOUR_SEC) / 60,
				          time % 60
		);
	}
}


