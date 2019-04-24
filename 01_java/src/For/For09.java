package For;

import java.util.Scanner;

public class For09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 행의 수를 입력하세요(1-10) : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("출력할 열의 수를 입력하세요(1-10) : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
//		">"	    짝수
//	 	"<"   홀수
		
		for (int i = num1; i > 0; i--) {
			for (int j = 1; j <= num2; j++ ) {
				if (i % 2 == 0) {
					System.out.print(">");
				} else {
					System.out.print("<");
				}
			}
			System.out.println();
		}
		

	
	
	
	
	
	
	
	
	
	
	}
}
