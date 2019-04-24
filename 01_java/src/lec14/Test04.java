package lec14;

class DoubleBag<K, V>{
	private K key;
	private V value;
	DoubleBag(K key, V value) {
		this.key = key;
		this.value = value;
		
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
}

public class Test04 {
	public static void main(String[] args) {
		DoubleBag<String, Integer> db = new DoubleBag<>("홍길동", 100);
		String key = db.getKey();  // 홍길동  key는 String 이기 때문에 String 으로 받아줘야한다
		int val = db.getValue(); // 100		value 는 Integer 이기 때문에 int 로 받아줘야 한다.
		System.out.println("key : " + key);
		System.out.println("value : " + val);
	}
}
