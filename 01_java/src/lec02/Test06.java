// 기본 데이터 타입 종류 이해하기..

package lec02;

public class Test06 {
	public static void main(String[] args) {
		// 정수를 담는 값을 표현하자
		// bit -> 8bit(byte)
		// byte(1) short(2) int(4) long(8)
		// int -> -2147483648 ~ 2147483647 
		// 크기 : byte < short < int < long
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1; // 영문자 L, l 을 숫자뒤에 붙여서 long 타입으로 값을 만든다.
		l = 1L;
		l = 1l; // 소문자 l은 가독성이 떨어짐.. 대문자 사용 권장
		
		// Type mismatch: cannot convert from int to byte
//		byte b2 = 128;
		
		// 실수 : float, double
		// float 데이터 타입 사용시 값 뒤에 f, F 붙여야 한다.
//		float f1 = 1.2;  // 에러발생
		float f1 = 1.2f;
		f1 = 1.2F;
		
		double d1 = 1.2;
		
		// 정수를 double 형으로 만들고 싶다면
		double d2 = 100d;
		
		// 문자도 숫자다(아스키코드)
		// 65(A), 97(a), 48(0)
		char c = 'a';
		char c2 = 65;
		char c3 = 97;
		char c4 = 48;
		char c5 = '\u0061';  // 유니코드16진수값
		char c6 = '\u0000';  // 유니코드16진수값
		System.out.println(c);
		System.out.println(c2);		
		System.out.println(c3);		
		System.out.println(c4);		
		System.out.println(c5);		
		System.out.println("|" + c6 + "|");		
		
		/*
		 * byte < short < int < long < float < double
		 *         char < int < long < float < double
		 */
		System.out.println('a' + 1);  // 98
		
		// boolean 은 true, false 외에는 값을 담을 수 없다.
		boolean bool = true;
		bool = false;
		
	}
}












