package lec.util;

public class LinkedList {
	class Node {
		private Object data;
		private Node next;
		Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node header = null;
	private int pos = 0;
	
	private Node getNode(int index) {
		Node node = header;
		for( int i=0; i < index; i++) {
			node = node.next;
		}
		return node;
	}
	
	public void addFirst(Object data) {
		// 최초 입력일 경우
		header = new Node(data);
		pos++;
	}
	
	public Object get(int index) {
		return getNode(index).data;
	}
	
	public void removeFirst() {
		header = header.next;
		pos--;
	}
	
	public Object getFirst() {
		return get(0);
	}
	
	public void add(int index, Object data) {
		if(index == 0) {
			addFirst(data);
			return;
		}
		
		Node previous = getNode(index-1);
		Node next = previous.next;
		Node newNode = new Node(data);
		previous.next = newNode;
		newNode.next = next;
		pos++;
	}
	
	public void addLast(Object data) {
		add(pos, data);
	}
	
	public void add(Object data) {
		addLast(data);
	}
	
	public void remove( int index ) {
		if(index == 0) {
			removeFirst();
			return;
		}
		
		Node previous = getNode(index-1);
		Node removeNode = previous.next;
		Node next = removeNode.next;
		previous.next = next;
		pos--;
	}
	
	public void removeLast() {
		remove(pos-1);
	}
	
	public boolean isEmpty() {
		return pos == 0 ? true : false;
	}
	
	public int size() {
		return pos;
	}
	
	public void clear() {
		Node node = header;
        while (node != null) {
            Node next = node.next;
            node.data = null;
            node.next = null;
            node = next;
        }
        
		header = null;
		pos = 0;
	}
	
	public String toString() {
		if (pos == 0) return "LinkedList[]";
		String result = "LinkedList[" + getFirst();
		if (pos == 1) return result += "]";
		
		Node node = header.next;
		while(node != null) {
			result += ", "	 + node.data;
			node = node.next;
		}
		return result += "]";
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 

		// LinkedList[]
		System.out.println(list);

		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);  // LinkedList[A, B, C]
		
		String data = (String)list.get(0);
		System.out.println(data);  // A
		
		int size = list.size();
		System.out.println(size);  // 3
		
		// 삭제 기능
		list.remove(1);  // B 삭제함..
		System.out.println(list.size());  // 2
		
		list.remove(0);  // B 삭제함..
		list.remove(0);  // B 삭제함..
		System.out.println(list);  // LinkedList[A, C]
		
		list.clear(); // 전체 데이터 삭제
		System.out.println(list.size());  // 0
		System.out.println(list);  // LinkedList[]
		System.out.println(list.isEmpty());  // true
		
		list.add("D");
		list.add("E");
		list.add(1, "B");
		System.out.println(list);  // LinkedList[D, B, E]
	}
}