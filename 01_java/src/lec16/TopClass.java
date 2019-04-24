package lec16;

public class TopClass {
	String data = "TopClass data";
	static String data2 = "TopClass static data";
	
	static class StaticMember{
		int val = 300;
		static int val2 = 400;   // static 클래스여야 static 변수를 가질 수 있다. (아래는 안됨)
		
		public void test() {
//			System.out.println(data);	// static 영역에서 non-static(instance) 영역을 접근 할 수 없다.
			System.out.println(data2);  // static 변수만 접근 가능
		}
		
		public static void call() {
			System.out.println("StaticMember - call");
		}
	}
	
	class InnerMember {
		int val = 100;
		//The field val2 cannot be declared static in a non-static inner type, unless initialized with a constant expression
		// 클래스에 static 이 붙지 않았으면 static은 내부 클래스 안에서는 사용이 불가능.
//		static int val2 = 200;
		public void call() {
			System.out.println("InnerMember call()");
		}
		public void test() {
			System.out.println(data);
			System.out.println(data2);
		}
		
	}
}
