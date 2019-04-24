/*
 *  클래스의 구성 : 메서드와 변수
 *  
 *  메서드 : 기능, 할일들을 묶어 놓은 것. 객체간의 메세지를 주고 받는다.
 *  
 *  필수 구성 요소 
 *  - 반환타입
 *  - 메서드의 이름
 *  - 매개변수, 파라미터, 인자 -> 변수의 선언
 *  
 *  형태
 *  [제한자 - 접근, 활용] 반환타입 메서드이름([매개변수, ...])
 *  접근제한자 : public, default(표시하지 않은 경우), protected, private
 * 	활용제한자 : abstract, transient, static ...
 */
package lec06;

//import java.util.Random;


//import java.util.Scanner;

// Method01에 선언되어 있는 메서드들을 호출하는 클래스
public class Test01 {
	public static void main(String[] args) {
	/*
		// 어느 클래스에 있는지 알수 없다.
//		method01();
		
		// 메서드를 사용하기 위해서는 
		// 메서드를 가지고 있는 클래스 객체를 생성
		Method01 m = new Method01();
		// 객체를 생성 후 -> 객체.메서드이름();
		// 메서드는 호출이 되는 순간 호출된 메서드로 이동한다.
		System.out.println("Test01에서 method01 메서드 호출");
		m.method01();
		System.out.println("Test01에서 method01 메서드 호출 종료 후");
		
		// Method01 클래스에 존재하는 method02 메서드를 호출하라..
		m.method02(100);
		
		m.method03("메서드 호출성공");
		
		// 오류가 안나도록 메서드를 정의한다.
		// 호출시 메서드에서 출력을 아래와 같이 결과가 나오도록 코드 추가
		// method04 호출 성공 : 성공했어요 100
		m.method04("성공했어요", 100);
		
		m.method05("a", "b");
		
		
		
		m.method06(new int[1], 2);
		// =
		m.method06(new int[] {1}, 2);
		// =
		int[] a = {1};
		m.method06(a,10);
		
		
		m.method07(new Random());
		
		
		// JeBal jebal = ??
		m.method08(new JeBal());

		
		/*
		Random r = new Random();
		int num = r.nextInt(10);
		*/
		
		/*
		// String -> int charAt(int index)
		// int index = ???
		String s = "abc";
		s.charAt(1);
		
		// String -> codePointAt(int index)
		s.codePointAt(1);
		
		// concat(String str)
		s.concat("asd");
		
		// endsWith(String suffix)
		s.endsWith("abc");
		
		// byte[]  getBytes()
		s.getBytes();
		
		// char[] dst = new char[1];
		// getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		s.getChars(1, 2, new char[1], 5);
		
		// indexOf(String str, int fromIndex)
		s.indexOf("abc", 1);
		
		Random r = new Random();
		int num = r.nextInt(10) + 1;
		
		//int num1 = r.nextInt();
		
		// setSeed(long seed)
		long l = 100;
		r.setSeed(100);
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		*/
	}
}


















