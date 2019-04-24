/**
 *   pop()  : 꺼내값 삭제
 *   peek() : 꺼내기
 *   push() : 입력
 */
package lec.util;

import java.util.Arrays;

public class Stack {
	final int CAPACITY = 5;
	private int top;
	private Object [] elements;
	
	public Stack() {
		this.elements = new Object[CAPACITY];
		this.top = -1;
	}
	
	public boolean empty() {
		return (top == -1);
	}
	
	public boolean full() {
		return (top == CAPACITY - 1);
	}
	
	public void push(Object item) {
		if( full() ) throw new IndexOutOfBoundsException();
		elements[++top] = item;
	}
	
	public Object peek() {
		if( empty()) throw new IndexOutOfBoundsException();
		return elements[top];
	}
	
	public Object pop() {
		Object item = peek();
		elements[top--] = null;
		return item;
	}
	
	public String toString() {
		return "Stack" + Arrays.toString(elements);
	}
}
