package lec03.homework;

public class Repetition10 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// 문자열을 활용한 방법
		String data = "";
		for (int i = 1; i <= 5; i++) {
			System.out.println(data += i);
		}
	}
}
