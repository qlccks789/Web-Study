package lec03.homework;

import java.util.Random;

public class Condition06 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(100) + 1;
		
		System.out.printf("발생된 숫자는 %d 이고 %s입니다.\n"
				          , num
				          , num % 2 == 0 ? "짝수" : "홀수");
	}
}
