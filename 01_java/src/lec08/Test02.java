/*
 *  생성자 특징






 *  
 *  - 생성자는 오버로딩을 지원한다.
 *  - 오버로딩 
 *  	: 객체지향 언어들의 공통의 특징(다형성 - 이름은 같은데 다른일을 한다.)
 *  	: 다형성 - 오버로딩, 오버라이딩, 변수의 다형성
 *  	: 클래스에 메서드의 이름이 같으면서 매개변수의 개수 또는 타입이 다른 것.
 *  	: (반환타입은 상관없음 - 같아도 되고, 달라도 된다)
 */
package lec08;

public class Test02 {
	public static void main(String[] args) {
		// 각각의 생성자를 한번씩 호출하는 코드를 작성
		Constructor02 con = new Constructor02();		// 매개변수 없는 생성자
		Constructor02 con1 = new Constructor02("a");	// 매개변수 문자열 생성자
		Constructor02 con2 = new Constructor02(1);		// 매개변수 정수 생성자
	

	}
}	
