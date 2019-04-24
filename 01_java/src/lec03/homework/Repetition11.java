package lec03.homework;

import java.util.Random;
import java.util.Scanner;

public class Repetition11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Set %d : ", i);			
			for (int k = 1; k <= 6; k++) {
				System.out.printf("%3d", r.nextInt(45) + 1);
			}
			System.out.println();
		}
	}
}
