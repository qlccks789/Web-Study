package For;

import java.util.Scanner;

public class For06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("수를 입력하세요 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		for (int i = num1; i <= num2; i++) {
			System.out.printf("%d단 : ", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d " , i * j);
			}
			System.out.println();
			System.out.println("--------------------------------------");
		}
		
		
		
		
	}	
}
