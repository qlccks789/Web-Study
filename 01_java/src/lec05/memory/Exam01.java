package lec05.memory;

class Node01 {
	int data = 0;
	Node01 next = null;
}

public class Exam01 {
	public static void main(String args[]) {
		Node01 head = new Node01();
		head.data = 0;
		Node01 tail = head;

		tail.next = new Node01();
		tail.next.data = 10;
		tail = tail.next;

		tail.next = new Node01();
		tail.next.data = 20;
		tail = tail.next;

		tail.next = new Node01();
		tail.next.data = 30;
		tail = tail.next;

		Node01 t = head.next;
		while (t != null) {
			System.out.println(t.data);
			t = t.next;
		}
	}
}