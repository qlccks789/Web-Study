package For;

import java.util.Random;
import java.util.Scanner;

public class For12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ranNo = r.nextInt(1000) + 1;
		int count = 1;
		System.out.println("1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)");
		
		while (true) {
			System.out.printf("%d회. 숫자를 입력하세요(1-1000) : ", count);
			int input = Integer.parseInt(sc.nextLine());
			count++;
			
			if (input < ranNo) {
				System.out.printf("%d보다 큰 값 입니다.%n",input);
			} else if (input > ranNo) {
				System.out.printf("%d보다 작은 값 입니다.%n",input);
			} else if (input == ranNo) {
				System.out.println("정답입니다.");
				break;
			}
			
			if (count == 11) {
				System.out.println("10회안에 맞추기 게임에 실패하였습니다.");
				System.out.printf("정답은 %d입니다.%n",ranNo);
				break;
			}
		}


	
	}
}
