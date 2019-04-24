package lec03;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 *    2 * 1 = 2
		 *    2 * 2 = 4
		 *    2 * 3 = 6
		 *    2 * 4 = 8
		 *    2 * 5 = 10
		 *    2 * 6 = 12
		 *    2 * 7 = 14
		 *    2 * 8 = 16
		 *    2 * 9 = 18
		 *    
		 *    290
		 *    2~19단 까지 가능합니다.
		 *    구구단 입력 : _
		 */
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("구구단 입력(종료 : -1) : ");
			int dan = Integer.parseInt(sc.nextLine());
			if (dan == -1) {
				break;
			}

			// 2~19단 까지 가능합니다.
			if (dan < 2 || dan > 19) {
				System.out.println("2~19단 까지 가능합니다.");
				continue;
			}
			for (int i = 1; i < 10; i++) {
				/*
				System.out.println(
						dan + " * " + i + " = " + dan * i);
				*/
				System.out.printf(
						"%d * %d = %2d%n", dan, i, dan * i);
			}
		}
	}
}













