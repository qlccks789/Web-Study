package lec03;

public class Test09 {
	public static void main(String[] args) {
		// 화면에 10 20 30 40 50 을 출력하시오
		// 단, 반복문을 활용합니다.
		for (int i = 10; i <= 50; i++) {
			if (i % 10 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 10; i <= 50; i += 10) {
			System.out.println(i);
		}
		for (int i = 1; i <= 5; i++) {
			System.out.println(i * 10);
		}
		
	}
}





