package lec01;

public class Test10 {
	public static void main(String[] args) {
		// ctrl + alt + 방향키(아래)
		// 문자열과의 연산
		// 문자열과의 연산은 "+" 만 가능(-, *, / : 불가능)
		System.out.println("3" + 3); // 33
		System.out.println("3" + 3.1); // 33.1
		System.out.println("3" + "3"); // 33
		// 3+3=33
		System.out.println(
				"3" + "+" + "3" + "=" + 3 + 3
		);
		System.out.println(
			3 + "+" + 3 + "=" + (3 + 3)
		);
		// 문자열과의 "+" 연산인 경우에는 printf 가 가독성이 좋다.
		System.out.printf(
			"%d + %d = %d %n", 3, 3, 3 + 3
		);
	}
}










