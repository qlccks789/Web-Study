/**
 * 				추상클래스 이해하기...

 *  
 * 	- 추상 : 구현되지 않은~, abstract -> 추상
 * 	- abstract 사용 위치 : 클래스(O), 메서드(O), 변수(X)
 * 	- abstract class : 추상클래스
 * 	- abstract method : 추상메서드
 * 	- 추상메서드 : 메서드의 선언만 하고 바디{}를 구현하면 안됨..
 * 	- 			ex> public void call() {}  -> O
 * 	- 			ex> public void call()  -> X
 * 	-			ex> public abstract void call() {}  -> X
 * 	-			ex> public abstract void call();-> 	O
 *  - 			추상메서드는 바디:{} 를 가지면 안된다.. 
 * 
 * 	- 클래스 안에 추상메서드가 선언되어 있다면 그 클래스가 추상 클래스로 선언이 되어야 한다..
 * 	- 추상클래스를 상속한 자식클래스는 반드시 부모클래스에 있는 추상메서드를 반드시 오버라이딩(재정의) 해줘야 한다.
 * 	- 추상클래스는 추상메서드 + 구현된 메서드 를 가질 수 있다. (추상클래스는 추상메서드만 가질 수 있는게 아니고 둘다 가질 수 있다..)
 * 	- 추상클래스는 객체 생성(new)이 불가능하다..  -> new AbsSuper();
 * 	- 추상클래스 타입으로 변수의 선언은 가능하다.
 * 	- 추상클래스 타입 변수에 값을 만들기 위해서는 자식 클래스를 이용해야 한다. (묵시적형변환)
 */
package lec11;

// 추상 클래스로 선언 후 추상메서드를 선언하기..
abstract class AbsSuper {
	public abstract void call();
	public void tell() {
		System.out.println("구현된 메서드");
	}
}

class AbsSub extends AbsSuper {		// 상속..
	public void call() {		// 오버라이딩..  추상메서드를 오버라이딩할때에는 abstract 은 빼고 오버라이딩 해야한다..
		System.out.println("자식 클래스에서 재정의한 call()");
	}
}

public class Test02 {
	public static void main(String[] args) {
//		new AbsSuper();  -> 추상클래스는 객체 생성이 불가능하다..
		AbsSuper aSuper;  // 추상클래스 타입으로 변수의 선언은 가능하다. 
//		aSuper = new AbsSuper();
//		aSuper = 자기자신은 불가능
//		aSuper = 자식 클래스는 가능 : 묵시적 형변환 관계 이용
		aSuper = new AbsSub();  // -> 자식클래스를 이용하여 객체(new)를 생성 할 수 있다..
		// 호출 가능한 것은 AbsSuper에 선언된 것만 가능함.. 이유 : AbsSuper aSuper; 라고 변수의 선언을 했기 때문에 aSuper는 자신의 클래스에 선언된 것만 가능함..
		aSuper.call();	// AbsSuper(부모클래스) 에도 있지만 AbsSub(자식클래스)에도 있으므로 자식클래스에 있는 call() 이 호출된다. (오버라이딩 되어있어서)
		aSuper.tell();
				
	}
}
