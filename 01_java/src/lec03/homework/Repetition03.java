package lec03.homework;

import java.util.Scanner;

public class Repetition03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하세요(2 - 10) : ");
		int num = sc.nextInt();
		
		System.out.printf("%d의 배수 : ", num);
		for (int count = 1; count <= 10; count++) {
			System.out.printf("%d ", count * num);
		}
	}
}
