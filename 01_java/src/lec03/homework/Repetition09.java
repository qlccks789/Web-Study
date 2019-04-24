package lec03.homework;

import java.util.Scanner;

public class Repetition09 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력할 행의 수를 입력하세요(1-10) : ");
		int row = Integer.parseInt(s.nextLine());
		
		System.out.print("출력할 열의 수를 입력하세요(1-10) : ");
		int column = Integer.parseInt(s.nextLine());
		
		while (row >= 1) {

			for (int i = 1; i <= column; i++) {
				System.out.print(row % 2 == 1 ? "<" : ">");
			}
			
			--row;
			System.out.println();

		}
	}
}
