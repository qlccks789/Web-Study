/**
 * 		내부클래스 (클래스안에 선언된 클래스)


 * 
 *   4가지 종류로 구분
 *   
 *   class TopClass {
 *   	// 멤버변수
 *   	class InnerClz {}
 *   	static class StaticInnerClz {}
 * 		// 메서드
 * 		void method() {
 *  		// 지역변수
 *  		class LocalInner {}
 *  		// 익명 클래스 - 이름이 없다.., 이벤트 처리..
 *  		// 클래스명 or 인터페이스명 은 익명클래스의 부모가 됨..
 *  		new 클래스명 or 인터페이스명 () {
 *				//변수
 *				//메서드  
 *  		}
 *  		
 *  
 *  
 *  // 익명클래스 예시
 *  		interface Run {
 *  			void a();
 *  		}
 *  		
 *  		// Run 상속받은 익명클래스
 *  		new Run () {
 *  			public void a() {}
 *  		};
 *  
 *  		interface Comparator<T> {
 *  			public int compare(T t1, T t2);
 *  		};
 *  		
 *  		// Comparator 상속받은 익명클래스
 *  		new Comparator<Data> () {
 *  			public int compare(Data t1, Data t2);
 *  			return ..;
 *  		};
 *  
 *  
 * 		}
 *   }
 *   
 *   
 */
package lec16;

public class Test01 {
	public static void main(String[] args) {
		TopClass top = new TopClass();
		
		// static 이 붙지않은 내부멤버 클래스
		TopClass.InnerMember im = top.new InnerMember();
		System.out.println(im.val);
		im.call();
		im.test();
	
		// static들은 클래스명.클래스명.클래스변수 로 부를수있다.
		TopClass.StaticMember.call();
		System.out.println(TopClass.StaticMember.val2); 

		// static 내부클래스 안의 인스턴스 변수 사용하기
		TopClass.StaticMember sm = new TopClass.StaticMember();
		System.out.println(sm.val);
		sm.test();
	}
}
