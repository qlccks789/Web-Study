package lec03.homework;

import java.util.Random;
import java.util.Scanner;

public class Repetition12 {
	public static void main(String[] args) {
		Random r = new Random( );
		int ansNum = r.nextInt(1000) + 1;
		System.out.println("1부터 1000사이의 숫자를 맞추는 게임입니다.(총 10회)");
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "회. 숫자를 입력하세요(1 - 1000) : ");
			int num = sc.nextInt();
			if(num == ansNum) { 
				flag = true;
				System.out.println("정답입니다.");
				break;
			} 
			String msg = num + "보다 큰 값 입니다.";
			if(num > ansNum) {
				msg = num + "보다 작은 값 입니다.";
			} 
			System.out.println(msg);
		}
		if (flag == false) {
			System.out.println("10회안에 맞추기 게임에 실패하였습니다.");
			System.out.println("정답은 " + ansNum + "입니다.");
		}
	}
}
