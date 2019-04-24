package lec04;

public class Test02 {
	public static void main(String[] args) {
		
		// 문자열 2개를 담는 공간을 만든다. 배열을 활용
		String[] strArr = new String[2];
		
		// 정수형 2개를 담는 공간을 만든다.
		int[] iArr = new int[2];
		
		// 배열은 생성시에 값의 자동초기화가 발생한다.
		// 기본형의 초기화는 
		// 정수(0), 실수(0.0), 문자(공백문자), 논리형(false)
		// 참조형은 null(나는 아직 주소가 없다)로 초기화 발생함..
		// 초기화된 값을 확인하자..
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		
		for (int i = 0; i < strArr.length; i++) {
			//  java.lang.ArrayIndexOutOfBoundsException: 2
			System.out.println(strArr[i]);
		}
		
		
	}
}














