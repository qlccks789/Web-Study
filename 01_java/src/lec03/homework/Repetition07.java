package lec03.homework;

public class Repetition07 {
	public static void main(String[] args) {
		int nValues = 100; 

		Outer : 
		for (int i = 2; i <= nValues; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) 
					continue Outer; 
			}
			System.out.print(i + " ");
		}
	}
}
