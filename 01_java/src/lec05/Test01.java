package lec05;

public class Test01 {
	public static void main(String[] args) {
		// Test01 클래스 객체를 생성했다.
//		Test01 t = new Test01();
		
		
		// 단팥빵, 1500, 팥이 많이 들어갔어요, 370
		Bread b1 = new Bread();

		// 피자빵, 2200, 피자 맛이 나요, 600
		Bread b2 = new Bread();
		
		// b1에 단팥빵의 정보 설정
		b1.name = "단팥빵";
		b1.price = 1500;
		b1.content = "팥이 많이 들어갔어요";
		b1.cal = 370;
		
		// b2에 피자빵의 정보 설정
		b2.name = "피자빵";
		b2.price = 2200;
		b2.content = "피자 맛이 나요";
		b2.cal = 600;
		
		// 생성된 공간에 있는 값을 확인 : 객체 생성시 인스턴스 변수의 값은 자동 초기화됨.
		System.out.println("이름 : " + b1.name);
		System.out.println("가격 : " + b1.price);
		System.out.println("설명 : " + b1.content);
		System.out.println("칼로리 : " + b1.cal);
		System.out.println();
		System.out.println("이름 : " + b2.name);
		System.out.println("가격 : " + b2.price);
		System.out.println("설명 : " + b2.content);
		System.out.println("칼로리 : " + b2.cal);
		
		
		
		
		
		
	}
}













