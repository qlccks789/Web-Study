/**
 *  명시적 형변환

 *  
 *  자식 = (자식)부모
 *  
 *  Animal a = new Dog();
 *  Cat c = (Cat)a;   -> 문법은 맞지만..실행 에러 (Animal에 개를 넣어놨는데 고양이로 바꾸려고해서)
 *  
 *  Animal a = new Dog();
 *  Dog d = (Dog)a;   -> 이게 정답..
 *  
 */
package lec10;

class Food {}

class Cake extends Food {}

class Fruit extends Food {}

public class Test02 {
	public static void main(String[] args) {
		Food f = new Cake();  // 묵시적 형변환
		
//		Fruit fruit = f;	// 컴파일 오류
		// 문법적 에러는 아님..
		// 실행시 메모리 참조때문에 에러 발생
		// : class lec10.Cake cannot be cast to class lec10.Fruit
//		Fruit fruit = (Fruit)f;	
		
		Cake c = (Cake)f;	// 명시적 형변환
		
	}
}
