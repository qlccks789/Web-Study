package lec02;

public class Test01 {
	public static void main(String[] args) {
		// 같은 값이 2번 이상 활용되면 변수를 사용한다.
		int i = Integer.parseInt("200");
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		
//		String msg = 100;  // 에러 발생함
		String msg = "100";
		double d = 3.14;
		
		// 변수에 대입하고 변수에 대입된 값을 화면에 출력하라...
		String result = 
				3 + " * " + 3 + " = " + (3 * 3);
		// 3 * 3 = 9
		System.out.println(result);
		// 결과값 : 3 * 3 = 9  출력문 작성하라..
		System.out.println("결과값 : " + result);
	}
}










