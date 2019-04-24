package For;

import java.util.Random;

public class For08 {
	public static void main(String[] args) {
		Random r = new Random();
		int cnt = 0 , cnt2 = 0;
		int ran = r.nextInt(11) + 10;
		System.out.println("생성된 숫자 : " + ran);
		
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
				
			}
			if (cnt == 1) {
				System.out.print(" " + i);
				cnt2++;
			}
			if (ran == cnt2) {
				break;
			}
			cnt = 0;
		}
		
	}	
}

