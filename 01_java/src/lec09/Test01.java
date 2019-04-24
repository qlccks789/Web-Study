/**
 *  상속 이해하기





 *  
 *   1. 재사용성
 *   2. 확장성
 *   3. extends 키워드 사용
 *  	상속하려는 클래스(B, C, D)  상속대상 클래스(A)	
 *  	ex>
 *  	class B extends A  -> B는 A클래스를 상속받았다.
 *  	class C extends A  -> C는 A클래스를 상속받았다.
 *  	class D extends A  -> D는 A클래스를 상속받았다.
 *   4. 부모(상위)(super) 클래스 : A
 *   	자식(하위)(sub)   클래스 : B, C, D
 *   5. B는 A이다. (B is A)
 *   6. 클래스는 클래스를 단일 상속 할 수 있다.
 *   	- 1개만 상속이 가능하다.(클래스가 클래스를 상속하는 것) 
 *   	- 트리모양
 *   7. Object 클래스는 모든 자바클래스의 최상위 부모 클래스이다.
 *   	Object 클래스의 메서드는 모든 클래스가 사용 할 수 있다.
 *   	extends 키워드를 사용하지 않은 모든 클래스는 자동으로 extends java.lang.Object 가 추가된다.
 *   8. 상속한 클래스의 메서드 및 변수의 사용이 가능하다.
 *   	단, 접근제한자(private)의 접근이 허용이 되어야 한다.
 *   9. 오버라이딩(다형성)
 *   	: 상속받은 부모클래스의 메서드를 그대로 사용하는게 아니라, 자신의 클래스에서 내용을 변경해서 처리하고 싶을 때 사용한다.
 *   	*** 제약사항  ***
 *   	오버라이딩 할 때에는 메서드의 3가지 필수 요소가 모두 동일하게 선언되어야 한다.
 *   	(3가지 : 반환타입, 메서드명, 매개변수)
 *   	접근제한자는 다르게 정의할 수 있다. But, (자식클래스의 접근제한자가 부모클래스의 접근제한자보다 범위가 좁으면 안된다.)
 *   	접근제한자의 접근범위 - public > protected > default > private 	
 *   	default : 접근제한자를 설정하지 않은 경우 기본적으로 할당되는 접근범위
 *   	protected : 상속받은 클래스에게만 사용 할 수 있게 해주는 것.
 *   10. super : 부모클래스를 가리키는 예약어
 *   		: super.변수명 -> 부모클래스의 멤버변수 호출
 *   		: super.메소드명 -> 부모클래스의 메서드 호출
 *   		: super( , ) -> 부모클래스의 생성자 호출
 *   		
 *   		: super() : 생성자 호출은 반드시 생성자 안에서만 호출해야 하고, 첫번째 구문으로 위치해야한다. (this의 특징과 동일)
 *   
 *   	* this()와 super()는 같이 사용이 불가능하다.  (둘다 첫번째 구문에 위치해야하기때문에)
 */		

package lec09;

public class Test01 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpNo(1);
		e1.setName("마이클");
		
		
		Employee e2 = new Employee("벤", 2);
		
		Manager m = new Manager("킹", 100, new Employee[] {e1, e2});	 // new Employee[] {e1, e2} -> e1,e2의 정보를 가져오겠다..
		System.out.println(m.info());
		
		
		/*
		String info = e1.info();
		System.out.println(info);
		System.out.println(e2.info());
		*/
	}
}
