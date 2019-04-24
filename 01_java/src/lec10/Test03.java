package lec10;

class Parent {
	public void msg() {
		System.out.println("Parent Msg");
	}
}

class Child1 extends Parent {
	public void msg() {
		System.out.println("Child1 - Msg");
	}
}
class Child2 extends Parent {
	public void msg() {
		System.out.println("Child2 - Msg");
	}
}
class Child3 extends Parent {
	public void msg() {
		System.out.println("Child3 - Msg");
	}
}

public class Test03 {
	private void showMsg(Parent p) {
		// 변수의 다형성
		p.msg();
	}
	public static void main(String[] args) {
		Test03 test = new Test03();
		test.showMsg(new Child1());
		test.showMsg(new Child2());
		test.showMsg(new Child3());
		
	}
	
}
