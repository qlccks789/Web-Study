// 소스를 폴더처럼 관리하고 싶다면?? 패키지(package)


// 패키지는 클래스 위에 선언되어야 한다.
// 자바 클래스명은 패키지명을 포함하고 있다.
// day01.lec04.Test03
// bin 하위에 패키지 구조를 가지고 클래스가 생성된다.
package lec01; 

// 메인메서드는 클래스에 항상 존재해야 하는가? 오류는 아니다.
// 단, 메인메서드가 없는 경우에는 실행은 안된다.
public class Test03 {
	public static void main(String[] a) {
		// 출력문 
		System.out.println(1);
		// 출력문의 종류
		System.out.print(2);
		System.out.print(3);
		System.out.println(4);
		System.out.println(5);
	}
}













