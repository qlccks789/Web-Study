/**
 *  final 사용
 * 	
 * 	1. 변수 : 상수로 사용하겠다.
 * 	2. 메서드 : 오버라이딩을 금지하겠다.
 * 	3. 클래스 : 상속을 금지하겠다. 
 */
package lec12;

//class MyString extends String {}  // String final 클래스 이므로 상속이 금지 (API클래스)

//final class Parent {  // final -> 상속이 금지된다.
class Parent {
//	final void call() {}  // final -> 오버라이딩이 금지된다.
	void call() {}
}

class Child extends Parent {
//	final int val = 100;  // final -> final 로 선언된 변수는 바꿀수 없다. : 상수로 사용하겠다.
	int val = 100;
	void call() {
		val = 200;
	} 
}

public class Test01 {
	public static void main(String[] args) {
		
	}
}
