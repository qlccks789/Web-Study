/**
 * 	Wrapper
 * 	- 기본형에 대한 참조타입 클래스
 * 
 * 	기본형 :		기본형클래스에대한 참조타입클래스:
 *  byte		Byte
 *  short		Short
 *  int			Integer
 *  long		Long
 *  float		Float
 *  double		Double
 *  char		Character
 *  boolean		Boolean
 * 
 */
package lec14;

import lec.util.ArrayList;

public class Test01 {
	private static void call(Object obj) {
		
	}
	public static void main(String[] args) {
	
		/* 1.4까지 사용하던 방식
		ArrayList list = new ArrayList();
		int i = 100;
		list.add(new Integer(i));
		Integer iObj2 = (Integer)list.get(0);
		int i3 = iObj2.intValue();
		
		Integer iObj = new Integer(i);	// -> 기본형을 참조형으로 변환  
		int i2 = iObj.intValue();  // -> .intValue(); : 참조형이 가지고 있는 값을 기본형으로 꺼내는 방법
		call(iObj);
		
		double d = 1.1;
		Double dObj = new Double(d);	// -> 기본형을 참조형으로 변환  
		double d2 = dObj.doubleValue();  // -> .doubleValue(); : 참조형이 가지고 있는 값을 기본형으로 꺼내는 방법
		call(dObj);
		*/
		
		// 1.5부터 편리하게 사용이 가능해짐
		int i = 100;
		// AutoBoxing 을 자동으로 해준다. : ( obj = new Integer(i) ); 
		Object obj = 1;		
		
		Integer iObj = new Integer(200);
		int j = iObj;  // AutoUnBoxing   .. int j = 10bj.intValue(); 를 자동으로 해줌.. 
		
		ArrayList list = new ArrayList();
		list.add(100);	
		list.add(200);
		list.add(300);
		
		int k = (Integer)list.get(0);
	}
}
