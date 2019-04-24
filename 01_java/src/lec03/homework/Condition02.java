package lec03.homework;

import java.util.Scanner;

public class Condition02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());

		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		int max = num1, min = num1;
		
		if (max < num2) max = num2;
		if (min > num2) min = num2;

		if (max < num3) max = num3;
		if (min > num3) min = num3;
		
		System.out.printf("최대값 : %d, 최소값 : %d", max, min);
	}
}




