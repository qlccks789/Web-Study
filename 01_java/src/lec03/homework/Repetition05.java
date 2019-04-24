package lec03.homework;

public class Repetition05 {
	public static void main(String[] args) {
		System.out.print(" :");
		for (int i = 1; i < 10; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println("\n---------------------------------------------");
		
		for (int i = 2; i < 10; i++) {
			System.out.print(i + "단 ");
			for (int k = 1; k < 10; k++) {
				System.out.printf("%4d", i * k);
			}
			System.out.println();
		}		
		System.out.println("---------------------------------------------");
	}
}
