package lec11.quiz;

import java.io.Serializable;


/*
 *  MyImp1 클래스가 API에 있는 인터페이스를 구현하는 코드를 작성하시오.
 *  에러가 발생하지 않으면 성공...
 *  
 *  java.lang.Runnable, java.io.Serializable
 */

class MyImp1 implements Runnable, Serializable {
	public void run() {
		System.out.println("자식에서 재정의한 메서드 호출됨..");
	}
}


public class Quiz01 {
	public static void main(String[] args) {
		Serializable s = new MyImp1();
		Runnable r = new MyImp1();
		r.run(); // -> 결과값 : 자식에서 재정의한 메서드 호출됨.. 이 출력
	}
}
