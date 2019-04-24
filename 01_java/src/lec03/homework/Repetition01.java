package lec03.homework;

public class Repetition01 {
	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum  = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evenSum += i;
				continue;
			}
			oddSum += i;
		}
		System.out.printf("홀수합계 : %d\n", oddSum);
		System.out.printf("짝수합계 : %d\n", evenSum);
		System.out.printf("전체합계 : %d\n", evenSum  + oddSum);
	}
}
