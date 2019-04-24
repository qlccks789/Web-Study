package lec07;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 문자열과 연관된 API 클래스 익히기
		// String, StringBuffer, StringBuilder
		// String 클래스는 상수 클래스이다..
		// Method Area / JVM Stacks / heap
		//    공유					  독립적
		
		// escape 문자 : \뒤에 올수 있는 것은 이미 정해져 있다.
		// ' (\') (문자인식) , "" (\" \") (문자인식) , t(Tab만큼 공간을 띄어라) , n(\n 줄내림) , b(\b 백스페이스), \\(경로표시)
		String s = "hello";
		s = s + "123";
		System.out.println(s);
		
		String s2 = new String("hello");
		
		StringBuffer sb = new StringBuffer("hello");
		
		StringBuilder sb2 = new StringBuilder("hello");
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(sb);
		System.out.println(sb2);
		
		
		
		String str1 = "a";
		if (str1 == "a") {					// -> 주소 비교
			System.out.println("1. 같다");
		}
		
		String str2 = new String("a"); 
		if (str1 == str2) {
			System.out.println("2. 같다");  // -> 출력이 안됨
		}
				
		if (str1 == str2.intern()) {  		// intern() : 주소비교 
			System.out.println("3. 같다"); 
		}
		
		if (str1.equals(str2)) {  			// -> 변수가 가지고 있는 값의 내용 비교
			System.out.println("4. 같다");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String input = sc.nextLine();		// new String(사용자가 입력한 값)
		
		// "a"의 주소와 input 의 참조 주소가 같은 지
		if (str1 == input) {					
			System.out.println("5. 같다");
		}
		
		// "a" 의 내용과 input 의 내용이 같은 지
		if ("a".equals(input)) {					
			System.out.println("6. 같다");
		}
		
	}
}
