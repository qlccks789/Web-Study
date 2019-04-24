package lec02;

public class Test10 {
	public static void main(String[] args) {
		// 산술연산자 -> +, -, *, /(몫), %(나머지)
		int num1 = 6;
		int num2 = 2;
		System.out.println(num1 + num2);  // 8
		System.out.println(num1 - num2);  // 4
		System.out.println(num1 * num2);  // 12
		System.out.println(num1 / num2);  // 3
		System.out.println(num1 % num2);  // 0
		
		// 산술연산에서 주의할 점...
		// int, short, byte, char는 int로 변환 후 연산
		byte b = 10;
		b = 9 + 1;

		byte b1 = 9;
		byte b2 = 1;
//		byte b3 = b1 + b2;
		byte b3 = (byte)(b1 + b2);
		System.out.println('a' + 1);
		
		System.out.println('A' + 'B');

		// 75
		System.out.println('A' + 10);
		System.out.println((char)'A' + 10);   // 75 
		System.out.println('A' + (char)10);   // 75
		System.out.println((char)('A' + 10)); // K
		System.out.println((char)(75)); // K
		
		System.out.println(5 / 2);    // 2
		System.out.println(5 / 2.0);  // 2.5
		System.out.println((double)(5 / 2));  // 2.0
		
		// % 나머지 연산자 : 짝수 홀수, ..
		// 2로 나누었을때 0이면 짝수 1이면 홀수
		int num3 = 100;
		// 100은 짝수입니다.
		System.out.printf(
				"%d은(는) %s입니다.%n", 
				num3,
				num3 % 2 == 0 ? "짝수" : "홀수"
		);
		
		// 100은 3의 배수가 아닙니다.
		// 99은 3의 배수 입니다.
		System.out.printf(
				"%d은(는) 3의 %s", 
				num3,
				num3 % 3 == 0 ? "배수입니다." : "배수가 아닙니다."
		);
	}
}











