package lec09;

public class Parent  /*extends java.lang.Object*/ {
	public Parent() {
//		super(); -> 부모를 설정해주지 않았으면  extends java.lang.Object 가 자동으로 부모로 상속된다..
		System.out.println(4);
	}
	public Parent(String name) {
		System.out.println(3);
	}
	
	
}
