package lec03.homework;

import java.util.Random;

public class Repetition02 {
	public static void main(String[] args) {
		Random random = new Random();
		int sum = 0;
		
		System.out.print("생성된 숫자 : ");
		// 5개의 랜덤한 숫자를 생성하고 생성된 숫자를 sum 변수에 더한다.
		for(int i = 0; i < 5; i++) {
			int num = random.nextInt(100) + 1; 
			sum += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/5.0);
	}
}
