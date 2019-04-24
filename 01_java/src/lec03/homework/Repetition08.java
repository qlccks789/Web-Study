package lec03.homework;

import java.util.Random;

public class Repetition08 {
	public static void main(String[] args) {
		Random random = new Random();
		int nPrimes = random.nextInt(11) + 10;

		outer: 
		for (int i = 2; ; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					continue outer;
			}

			System.out.print(i + " ");
			if (--nPrimes == 0)
				break;
		}
	}
}
