package lec11.testb;

import lec11.testa.A;

public class D extends A{
	public D() {	// 상속받았기 때문에 A를 생성해주지 않아도 된다..
//		System.out.println(i);	//에러 : private
//		System.out.println(j);	//에러 : default
		
		// 상속관계가 있다면 protected 변수는 위치에 상관없이 접근이 가능하다.
		System.out.println(k);
		System.out.println(m);
	}
}
