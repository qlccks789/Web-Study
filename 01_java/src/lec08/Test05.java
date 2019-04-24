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

public class Test05 {
	String msg = "nonStatic 메세지";		
	static String msg2 = "Static 메세지";		

	void call() {
		// non-static 영역에서는 static 영역을 접근 할 수 있다..
		System.out.println(msg);
		System.out.println(1);
		System.out.println(msg2);
		System.out.println(2);
	}
	static void call2() {}
	
	public static void main(String[] args) {
		System.out.println(msg2);
		System.out.println(3);
		call2();
		// static에서 non-static 영역의 변수는 객체생성 후에 접근 할 수 있다.
//		System.out.println(msg);	// 에러 : 같은 static이 아니어서.. (non-static영역을 접근할수없어서)
//		call();  -> 접근이 불가..
		
		Test05 t = new Test05();
		t.call();
		System.out.println(t.msg);
		System.out.println(4);
		
		StaticSub05 ss = new StaticSub05();
		System.out.println(5);
		
		System.out.println(ss.i);
//		System.out.println(ss.k);  // static 선언되어있는 것을 쓰려면 
		// Static 으로 선언된 변수,메서드는 (클래스이름.변수명) , (클래스이름.메서드)  이렇게 써야한다..
		System.out.println(StaticSub05.k);
		
	}
}
