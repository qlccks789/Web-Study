/*
 * 	생성자





 * 	- 메서드인데 특정 시점에만 호출할 수 있다.
 * 	- 객체를 생성(new)하는 시점에만 호출이 가능함. (new 생성자()) : constructor
 * 	
 *  - 2가지 필수 요건
 *  - (1). 이름이 클래스와 동일하다.
 *  = (2). 반환타입 자체를 설정하지 않는다. (void - X) 
 */
package lec08;

public class Tset01 {
	public static void main(String[] args) {
		//생성자 메서드 호출..
		//객체를 new 할 때 호출,,
		System.out.println("main start");
		Constructor01 con01 = new Constructor01();
		System.out.println("main end");
		
	}
}
