package lec11.testb;

import lec11.testa.A;

public class C {
	public static void main(String[] args) {
		A a = new A();	// class A와 패키지가 다르기때문에 일단 생성과 import 해준다..
//		System.out.println(a.i);	//에러	: private 
//		System.out.println(a.j);	//에러	: default
//		System.out.println(a.k);	//에러	: protected
		// 다른 패키지의 클래스와 관계가 없다면 public 선언된 것만 접근 가능하다..
		System.out.println(a.m);	
	}
		

}
