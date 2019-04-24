package lec11.quiz;

import java.util.Iterator;

class MyArray {
	String[] data = {"홍길동", "임꺽정", "장길산"};
	int pos = 3;
	
	public Iterator iterator() {
//		return new Iterator();  // 에러 : 인터페이스는 객체 생성 불가
		return new MyIterator2();
	}
	// 내부클래스
	class MyIterator2 implements Iterator {
		
		;
		int index = 0;
		
		public boolean hasNext() {
			return index < pos;
		}
		
		public Object next() {
			return data[index++];
		}
	}
}

public class Quiz03 {
	public static void main(String[] args) {
		MyArray ma = new MyArray();
		Iterator ite = ma.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
}
