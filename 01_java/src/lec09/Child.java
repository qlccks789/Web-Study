package lec09;

public class Child extends Parent {
	public Child() {
//		super(); -> 자동추가됨.. this() 나 super()가 없기때문에..
		System.out.println(1);
	}
	public Child(int i) {
		this();
		System.out.println(2);
	}
}
