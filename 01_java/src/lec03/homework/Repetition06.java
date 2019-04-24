package lec03.homework;

import java.util.Scanner;

public class Repetition06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자를 입력 하세요(2 - 9) : ");
		int begin = sc.nextInt();	
		System.out.print("두번째 숫자를 입력 하시오(2 - 9) : ");
		int end   = sc.nextInt();
		
		int temp = 0;
		if (begin > end) {
			temp  = end;
			end   = begin;
			begin = temp;
		}
		
		System.out.println("---------------------------------------");
		for (int dan = begin; dan <= end; dan++) {
			System.out.printf("%d단", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%4d", dan * i);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
	}
}
