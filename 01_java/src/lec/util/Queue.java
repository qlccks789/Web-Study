package lec.util;

public class Queue {
	final int CAPACITY = 10;
	int head = 0, tail = -1, size = 0;
	int[] queue = new int[CAPACITY];
	
	public boolean full() {
		return size == CAPACITY ? true : false;
	}
	
	public int insert (int i) {
		tail = (tail + 1) % CAPACITY;
		size++;
		queue[tail] = i;
		return queue[tail];
	}
	
	public boolean empty() {
		return size == 0 ? true : false;
	}
	
	public int remove() {
		int val = queue[head];
		queue[head] = 0;
		head = (head + 1) % CAPACITY;
		size--;
		return queue[head];
	}
	
	
	
}
