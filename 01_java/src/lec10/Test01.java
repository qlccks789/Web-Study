/**
 *  객체의 형변환


 *  - 조건 : 상속관계가 있어야 한다.
 * 
 *  - 종류 : 명시적형변환 - 형변환연산자(타입), 묵시적형변환
 *  
 *  - 부모 = 자식   : 묵시적 형변환
 *  - 자식 = (타입)부모   :  명시적 형변환
 *  
 * 묵시적 형변환 이해하기...
 *  : 부모 객체 = 자식
 *  부모클래스의 객체는 자기 자신 타입에 선언된 변수 및 메서드를 접근한다.
 *  예외>
 *  자식클래스에서 부모클래스의 메서드를 오버라이딩 했다면  자식클래스의 오버라이딩 된 메서드가 호출된다.
 */
package lec10;

public class Test01 {
	public static void main(String[] args) {
		Animal ani = new Animal();
		Cat cat = new Cat();
		
		Animal ani2 = cat;	// 부모 = 자식 : 묵시적 
		System.out.println(ani2.name);	// Animal
		System.out.println(ani2.age);	// 0
		ani2.eat();// 후루룩~ 후루룩~		// 오버라이딩된 자식 메서드가 호출됨..  
//		ani2.tell();  // 에러
	}
	
}
