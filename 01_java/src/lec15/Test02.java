/**
 * 	요소를 반복하기

 * 	
 * 
 * 
 */
package lec15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		System.out.println("1. -----------------------");
		for (int i = 0; i < list.size(); i++) {
			String data = list.get(i);
			System.out.println(data);
		}
		
		System.out.println("2. -----------------------");
		for (String data : list) {
			System.out.println(data);
		}
	
		System.out.println("3. -----------------------");
		/*
		 *  hasNext() : 요소가 존재하는지 판단(true, false)
		 *  next() 	  : 요소 추출
		 *  remove()  : 가리키는 요소 삭제
		 */
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String data = ite.next();
			System.out.println(data);
		}
	
	}
}
