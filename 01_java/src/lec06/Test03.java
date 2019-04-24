/*
 * 	변수

 * 	 - 멤버변수 (static 이 붙지 않은 경우)
 * 	 	: 메서드 밖에 선언된 변수
 * 		: 자신이 선언된 클래스 내에서 사용이 가능
 * 		: 객체 생성시 자동 초기화 
 * 		: static 이 붙은 경우는 별도 생각...
 * 	
 * 
 *  - 지역변수 
 * 		: 메서드 안에 선언된 변수, 매개변수
 *	 	: 자신이 선언된 메서드 내에서 사용이 가능
 *		: 자동 초기화가 되지 않는다.  따라서 개발자가 초기화 시켜야 한다.
 *
 */

package lec06;

public class Test03 {
	// 멤버변수(필드, 프로퍼티)  : 메서드 밖에 생성..
	String msg = "멤버변수";
	
	public void call() {
		//지역변수(로컬변수), 값이 초기화 되지 않았다.  -> 지역변수 : 메서드 안에 생성...
		int i;
		
		
		
		i = 10;   // -> 초기화
								// i = 10; 이 없고  int i; 만 있을때 
		System.out.println(i);  // 에러 : The local variable i may not have been initialized  -> i변수를 초기화 해줘야한다.
		System.out.println("msg : " + msg);
	}

	void tell() {
		System.out.println("msg : " + msg);
	}
	
	// java lec06.Test03
	public static void main(String[] args) {
		// 지역변수
		System.out.println(args);

	}
	


}
