package lec01;

public class Test08 {
	public static void main(String[] args) {
		// 다양한 출력 printf : c 언어 계열에서 가져왔음.
		// 패턴 문자 사용 : % 로 시작한다., printf 에서만 가능
		/* 
		 * %d : 정수, 100  2  18781 
		 * %f : 실수, 1.12  3.14
		 * %s : 문자열, "문자열"  
		 */
		System.out.printf(
			"오늘 날씨가 춥네요\n"
		);
		System.out.printf(
			"오늘 날씨가 %s\n", "춥네요"
		);
		System.out.printf(
			"%s 날씨가 %s\n", "춥네요", "오늘"
		);
		// 오늘 날씨가 13 도 입니다.
		// 오늘, 13 의 값을 패턴문자를 통해서 받는다.
		System.out.printf(
			"%s 날씨가 %d 도 입니다.%n", "오늘", 13
		);
		System.out.printf(
			"저의 시력은 %f 입니다. %n", 1.2
		);
		// % 문자의 해것은 printf 만 ...
		System.out.println("저의 시력은 %f 입니다.");
	}
}

















