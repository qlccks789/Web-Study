package lec11.quiz;

import java.util.ArrayList;
import java.util.Iterator;

// MyIterator 클래스 작성하자..

class MyIterator implements Iterator {
	String[] data = {"홍길동", "임꺽정", "장길산"};
	int pos = 3;
	int index = 0;
	
	public boolean hasNext() {
		return index < pos;
	}
	
	public Object next() {
		return data[index++];
	}
}

public class Quiz02 {
	public static void main(String[] args) {
		Iterator ite = new MyIterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		ArrayList a1 = new ArrayList();
		a1.add("홍길동");
		a1.add("장길산");
		a1.add("임꺽정");
		
		
	}
}
