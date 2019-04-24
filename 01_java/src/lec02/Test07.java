/*
 *   기본형의 타입 변환(형변환)

 *   2가지 (묵시적 형변환 : 작은 -> 큰, 명시적 형변환 : 큰 -> 작은)
 */
package lec02;

public class Test07 {
	public static void main(String[] args) {
		byte b1 = 100;
		int i1 = 100;
		
		int i2 = b1; // 묵시적 형변환 : int = byte
		
//		byte b2 = i1; // 명시적 형변환 상황임.. 에러
		byte b2 = (byte)i1; // 형변환 연산자를 활용
		System.out.println(i2);
		System.out.println(b2);
		
		// boolean은 다른 타입과의 형변환을 지원하지 않는다.
	}
}










