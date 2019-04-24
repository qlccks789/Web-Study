/*
 * 	static 이 붙은 변수 또는 메서드 를 클래스 변수, 클래스 메서드 라 부른다.

 * 	static 이 붙지 않은 변수 또는 메서드 를 인스턴스 변수, 인스턴스 메서드 라 부른다.
 * 
 * 	static 영역에서 non-static 영역을 접근 할 수 없다.
 * 	non-static 영역에서는 static 영역을 접근 할 수 있다.
 * 
 * 	static 의 메모리는 클래스정보가 로딩될때 메모리가 생성된다.	(MethodArea)
 * 	non-static의 메모리는 객체가 생성될 때(new) 메모리가 생성된다.(Heap)
 * 
 * 	클래스정보는 한번만 메모리에 로딩된다. (클래스로딩 시점 - 클래스가 사용될 때 동적으로 로딩됨)
 */
package lec08;

public class StaticSub05 {
	int i = 100;  // 인스턴스 변수
	static int k = 100;  // 클래스 변수
	
	// static 블럭 : 클래스정보가 로딩될 때 같이 실행됨..
	static {
		k = 1000;
		System.out.println("클래스 정보 로딩");
	}
	public StaticSub05() {
		System.out.println("StaticSub05 생성자");
	}
}
