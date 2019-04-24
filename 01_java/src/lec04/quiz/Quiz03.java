package lec04.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 *   수를 입력 : 3
		 *   배열에 3이 1개가 들어있습니다.
		 *   
		 *   수를 입력 : 1
		 *   배열에 1이 0개가 들어있습니다.
		 *   
		 *   수를 입력 : -1
		 *   종료합니다.
		 */
		int[] arr = {6, 8, 3, 9, 7, 4};	
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("수를 입력 : ");
			int input = Integer.parseInt(sc.nextLine());
			if (input == -1) break;
			
			int findCount = 0;
			for (int val : arr) {
				if (val != input) continue;
				
				findCount++;
			}
			System.out.printf("배열에 %d개가 들어있습니다.\n", findCount);
		}
		System.out.println("종료합니다.");		

	}
}







