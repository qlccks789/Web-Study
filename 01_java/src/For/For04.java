package For;

import java.util.Scanner;

public class For04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			sum += i;
			if (sum == num) {
				System.out.printf("%d는 완전수 입니다.", num
						);
			}
		}
		
		
		
		
		
	}
}
