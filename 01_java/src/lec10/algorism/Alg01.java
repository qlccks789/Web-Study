// 정렬..

// 링크드리스트 구조 만들어 보세요
// 더블링크드 리스트
// 원형링크드 리스트
// 큐 구조를 ...
// 스텍 구조를 ...
// ..........................

package lec10.algorism;

import lec.util.ArrayList_String;

public class Alg01 {
	public static void main(String[] args) {
		ArrayList_String list = new ArrayList_String();
		
		
		// ArrayList[]
		System.out.println(list);

		list.add("홍명보");
		list.add("김연아");
		list.add("박항서");
		list.add("이강인");
		list.add("박지성");
		
		// ArrayList[홍명보, 김연아, 박항서, 이강인, 박지성]
		// ArrayList 클래스에 toString 메서드를 재정의하라...
		System.out.println(list);
		
		String data = list.get(0);
		System.out.println(data); 	// 화면에 홍명보 출력
		
		int size = list.size();
		System.out.println(size);   // 화면에 5가 출력
		
		// 삭제 기능
		list.remove(1);
		System.out.println(list.size()); // 4
		System.out.println(list); 	// ArrayList [홍명보, 박항서, 이강인, 박지성]
		
		list.clear();   // 전체 데이터 삭제
		System.out.println(list.size());  // 0
		System.out.println(list); 	// ArrayList []
		
		
		System.out.println(list.isEmpty());  // true
		list.add("이강인");
		list.add("마이클조던");
		list.add(1, "김정");
//		 ArrayList[이강인, 김정, 마이클조던]
		System.out.println(list); 	
		
		
		
	}
}
