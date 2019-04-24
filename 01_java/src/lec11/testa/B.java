package lec11.testa;

public class B extends A{
	public B() {
		// 상속관계에 있더라도 private 는 접근 불가능
//		System.out.println(i);  // 에러 : private 이기 때문에 접근이 불가능하다..
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
	}
}
