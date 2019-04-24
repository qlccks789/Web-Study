/**
 * 			인터페이스 이해하기..


 * 
 * 	- 완벽한 추상이다. (추상메서드만 선언 가능함) (구현된 메서드 선언 불가능)
 * 	- 8버전부터 default 메서드, static 메서드 추가 : 확장을 위해서 나온 개념..
 * 	- 직접 객체 생성 불가능함..
 * 	- 인터페이스의 활용은 자식클래스를 이용해서 한다...
 * 	- 자식클래스는 인터페이스에 선언된 추상메서드를 모두 재정의(오버라이딩) 해야한다.
 *  - 선언되는 모든 메서드는 기본적으로 추상메서드로 적용된다.
 *  	(abstract 생략가능) (자동으로 public 접근제한자가 추가된다.)
 * 	     =	(public abstract 키워드가 자동 추가되는 개념이다..)
 * 	
 * 	- 인터페이스에 선언되는 모든 변수는 자동으로 public static final 키워드가 추가된다.
 * 	- 인터페이스 선언 : 
 * 		: interface 키워드를 사용한다.  interface A{}
 * - final = 값을 수정, 변경 하지 못한다.  
 *	
 *	- 상속하기
 *		: class extends class   : 클래스가 클래스를 상속
 *	- 클래스가 인터페이스 상속할 때
 *		: class extends interface -> (X)
 *		: class implements interface -> 클래스가 인터페이스 상속할 때 	
 *	- 인터페이스가 클래스 상속은 불가능하다..
 *		: interface   class  -> (X)
 *	- 인터페이스가 인터페이스를 상속할 때
 *		: interface extends interface 
 * 	
 * 	- 인터페이스는 다중 상속이 가능하다. (~able)
 * 		: class implements interface, interface, interface, ... (클래스가 인터페이스를 상속할 때 여러개의 인터페이스를 할 수 있다) 
 * 		: interface extends interface, interface, interface, ...	(인터페이스가 인터페이스를 상속할 때 여러개의 인터페이스를 할 수 있다)
 * 
 */

package lec11;

interface A{	// -> 인터페이스 생성
	void a();	// public abstract void a(); -> public abstract가 자동생성됨.-> 추상메서드 이기 때문에 {}(바디)를 붙이면 안된다..
	String MSG = "인터페이스에서 알려준 메세지";  // -> public static final String msg = ; -> public static final이 자동생성됨..
}				

interface B {
	void b();
}

interface C extends A, B {		// 인터페이스가 인터페이스를 다중 상속..  인터페이스->인터페이스 : extends
	void c();
}

class D implements C {  // 클래스가 인터페이스를 상속 ..  클래스->인터페이스 : implements
	public void a() {}	// 부모가 가진것을 오버라이딩 해줘야 한다.. 
	public void b() {}	// interface에 있는 메서드가 public 이 자동으로 생성됐기 때문에 public을 줘야함..
	public void c() {}
}

class E implements A, B {	// 클래스가 인터페이스를 다중 상속..
	public void a() {}		
	public void b() {}
}

public class Test03 {
	public static void main(String[] args) {
		System.out.println(A.MSG);   // static으로 적용되어 있는지 확인 (클래스이름. 으로 접근)
//		A.MSG = "변경";  // final이 적용되어있는지 확인 ..  (final이 있으면 값을 변경 할 수 없기 때문에 에러가 남..)
	}
}

