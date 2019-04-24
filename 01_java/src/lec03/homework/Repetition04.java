package lec03.homework;

import java.util.Scanner;

public class Repetition04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int divisorSum = 0;
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) divisorSum += i;
		}
		
		System.out.printf("%d은 완전수%s"
				          , num
				          , divisorSum == num ? "입니다." : "가 아닙니다.");
	}
}
