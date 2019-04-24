/*
	화면에서 출생년도를 입력 받아 띠를 출력하는 프로그램을 작성하시오
	
    (단, 띠는 배열을 이용)
        띠 정보 : "원숭이", "닭", "개", "돼지", "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양"
        출력형식 >
            당신의 태어난 년도를 입력하세요 : 1980
            당신의 1980년에 태어난 당신은 원숭이띠 입니다. 

 */
package lec05.homework;

import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] yearName = {
			"원숭이", "닭", "개", "돼지", "쥐", "소",
			"호랑이", "토끼", "용", "뱀", "말", "양"
		};
		
		// 아래에 코드를 추가해 주세요..
		
		System.out.print("당신이 태어난 년도를 입력하세요 : ");
		int input = Integer.parseInt(sc.nextLine());
		
		System.out.printf("당신의 %d년에 태어난 당신은 %s띠 입니다.", input, yearName[input%12]);
		
		
		
	}
}