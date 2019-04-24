package For;

import java.util.Arrays;
import java.util.Random;

public class For11 {
	public static void main(String[] args) {
		Random r = new Random();
		final int max = 45;
		int[] arr = new int[6];
		
		outer:
		for (int i = 0; i < arr.length;) {
			int val = r.nextInt(max) + 1 ;
			for (int j = 0; j < i; j++) {
				if (arr[j] == val) {
					continue outer;
				}
				
			}
			arr[i++] = val;
			System.out.println();
		}
		
		
		
		
		
		
		
		/*
		Random r = new Random();
		int max = 45;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Set %d : ", i);
			for (int j = 1; j <=6; j++) {
				System.out.printf(" %2d" , r.nextInt(max)+1);
			}
			System.out.println();
		}
*/		
		
	}
}
