package lec03;

import java.util.Scanner;

public class Quiz03 {
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
			System.out.print("시작단 입력(종료 : -1) : ");
			int beginDan = Integer.parseInt(sc.nextLine());
			if (beginDan == -1) {
				break;
			}

			System.out.print("종료단 입력 : ");
			int endDan = Integer.parseInt(sc.nextLine());
			
			// 2~19단 까지 가능합니다.
			if (beginDan < 2 || beginDan > 19) {
				System.out.println("시작단은 2~19단 까지 가능합니다.");
				continue;
			}

			// 2~19단 까지 가능합니다.
			if (endDan < 2 || endDan > 19) {
				System.out.println("종료단은 2~19단 까지 가능합니다.");
				continue;
			}
			
			for (int dan = beginDan; dan <= endDan; dan++) {
				for (int i = 1; i < 10; i++) {
					System.out.printf(
						"%2d * %2d = %3d%n", dan, i, dan * i);
				}
			}
		}
	}
}













