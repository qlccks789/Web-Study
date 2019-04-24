/**
 * 	Generic (제너릭) 
 * 	- 1.5 버전부터 제공되는 기능임
 * 	- 클래스 선언시 Generic 기능을 적용한다.
 *  - Object 를 이용해서 받았던 여러가지의 참조형 데이터를 Generic을 이용해서 받을 수 있다.
 *  - 데이터의 형변환을 하지 않아도 된다.
 *  - 특정 데이터만 받도록 선언이 가능하다.(컴파일 시점에 체크 가능) 
 *  
 *  - class 클래스이름<파라미터명>
 *    파라미터명 : 원하는 이름을 대입 할 수 있다.
 *    		 : 권장하는 1차 후보 이름들이 있음..
 *   
 *  - 권장하는 파라미터명 
 *  	-> T : Type
 *  	   E : Element
 *  	   K : Key
 *  	   V : Value
 *  	   N : Number
 *  	   
 *   class 클래스이름<파라미터명> 
 *   class Bag<T>
 *   class Bag<E> 
 *   class Bag<K, V> 
 *   class Bag<N>
 *   
 *  컴파일 시에 파라미터명에 선언되어 있는 코드가 변경된다.
 *	static 관련 변수 또는 메서드는 사용이 불가능함.
 *  배열 생성시에는 사용 불가능 : 리플렉션API 활용시 가능..
 */

package lec14;

import java.util.ArrayList;

class Bag<T> {
//	static T val; // static 관련 변수 또는 메서드는 사용이 불가능함.
	T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}


public class Test03 {
	public static void main(String[] args) {
		/*
		ArrayList<String> list = new ArrayList<String>();
		String ele = list.get(0);
		*/
		
		// Bag is a raw type. References to generic type Bag<T> should be parameterized
		Bag bag = new Bag();
		
		
		Bag<String> bag1 = new Bag<>();
//		Bag<Integer> bag2 = new Bag<Integer>();
		bag1.setData("a");
//		bag1.setData("100");  // 에러발생함 : 컴파일시 체크
		String data = bag1.getData();
		System.out.println(data);
	
	}
}
