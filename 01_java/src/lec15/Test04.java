/**
 *  Stack --> LIFO ( Last In First Out)

 *  
 *  push : 입력
 *  pop  : 데이터를 꺼내고 삭제
 *  peek : 꺼내고 삭제X
 */
package lec15;

import java.util.Stack;

public class Test04 {
	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		s.push("e");
		System.out.println(s);
		
		System.out.println("pop : " + s.pop());
		System.out.println(s);
		System.out.println("pop : " + s.pop());
		System.out.println(s);
		System.out.println("pop : " + s.pop());
		System.out.println(s);

		System.out.println("peek : " + s.peek());
		System.out.println("peek : " + s.peek());
		System.out.println(s);
	}
}
