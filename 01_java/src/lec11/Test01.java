/**
 * 	접근 제한자
 * 	public > protected > default > private
 * 	
 * 	public : 모든 패키지에서 접근이 가능하다.
 * 	protected : default + 다른 패키지와 상속관계가 있다면 접근이 가능.
 * 	default : 내가 선언된 패키지와 같은 패키지만 접근이 가능하다.
 * 	private : 내 클래스에서만 나를 접근할 수 있다.
 * 
 * 	클래스(최상위) : public, default 가 선언이 가능하다   ex> public class Test01 / class Test01
 *  메서드, 변수(필드), 내부클래스 : public, protected, default, private 가 선언이 가능하다
 */

package lec11;

import lec11.testb.C;

public class Test01 {	
	public static void main(String[] args) {
		C c = new C();
			
//		System.out.println(Integer.parseInt("100"));
	
/*
		package java.lang;
		
		public calss System {
			public static 참조클래스타입 out;
		}
		
		package java.lang;
		public class Integer {
			public static int parseInt(String val){
				........val -> integer화 -> v
 				return v;
		}
 */
		
	}
}
