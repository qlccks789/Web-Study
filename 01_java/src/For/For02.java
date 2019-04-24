package For;

import java.util.Random;

public class For02 {
	public static void main(String[] args) {
	Random r = new Random();
	int sum = 0;
	
	
	System.out.print("생성된 수 : " + "");
	for (int i = 1; i <= 5; i++) {
		sum += r.nextInt(100)+1;
		System.out.print("" + sum + " ");
	}
	System.out.println();
	System.out.println("합계 : " + sum);
	System.out.printf("평균 : %.2f", sum/5.0);
	}
}
