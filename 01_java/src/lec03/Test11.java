package lec03;

import java.util.Random;

public class Test11 {
	public static void main(String[] args) {
		Random r = new Random();
		int breakNum = r.nextInt(20) + 1;
		System.out.println("breakNum : " + breakNum);
		for (int i = 1; i <= 20; i++) {
			if (breakNum == i) break;

			System.out.println(i);
		}
		System.out.println("반복 빠져나옴..");
	}
}










