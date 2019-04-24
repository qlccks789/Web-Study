package lec03.homework;

import java.util.Scanner;

public class Condition04 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		if (num < 0) {
			result = -num;
		} else {
			result = num;
		}
		System.out.printf("%d의 절대값 : %d", num, result);
		
		
		
	}
}
