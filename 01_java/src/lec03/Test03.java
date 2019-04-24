/*
 * 조건 제어문과 반복 제어문..

 * 
 * 조건 제어문 : if - 조건연산자( (조건식) ? 값1 : 값2 )
 */
package lec03;

public class Test03 {
	public static void main(String[] args) {
		/*
		  	if 문의 형식
		  	
		  	블럭 없이 조건식을 작성한 경우에는 한문장만이 조건식의 영향을 받는다.
		  	한문장의 구분은 ";" 으로 구분된다.
		  	if (조건식) 
				조건식이 참일 경우에 실행할 명령문;
				
		  	if (조건식) {
		  	
		  	}
		
		 */
		int a = 6;
		if (a == 5)
			System.out.println("a는 5입니다.");
		
		// 조건에 영향을 받지 않는다.
		System.out.println("a는 홀수 입니다.");
		
		System.out.println("2. --------------------");
		if (a == 5) {
			System.out.println("a는 5입니다.");
			System.out.println("a는 홀수 입니다.");
		}
	}
}


















