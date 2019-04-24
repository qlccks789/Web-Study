/*
 * 	Object - toString() 메서드 이해하기\

 * 	
 */
package lec09;

import java.util.ArrayList;

class Dog {
	private String name;
	private int age;
	public Dog() {}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// toString() 오버라이딩 단축키 : Alt + Shift + s + s
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	// 내가 원하는 값을 넣어서 사용하기 위해서 toString을 오버라이딩 해준다..
	
	// Object - toString() 오버라이딩 한다..
//	public String toString() {
//		return "Dog [name=" + name + ", age =" + age + "]";
//	}
	
	
}

public class Test03 {
	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d2 = new Dog("메리", 25);
		System.out.println(d);			  //  // toString() 메소드가 자동 호출된다.
		System.out.println(d2);			  
//		System.out.println(d.toString()); // lec09.Dog@1e6d1014
		
		int[] arr = {1, 2, 3};
		System.out.println(arr); // [I@76707e36
		
		String[] sArr = {"a"};
		System.out.println(sArr); // [Ljava.lang.String;@614ddd49
		
		String str = "a";
		System.out.println(str); // a
		System.out.println(str.toString()); // a
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		System.out.println(list); // [hello]
	}
}
