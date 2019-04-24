// 20190115 (화)
package lec07;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws UnsupportedEncodingException {

		// valueOf : 기본형 또는 참조형을 문자열로 변경할 때 사용..
		String str = String.valueOf(1);
		str = String.valueOf(1.1);
		str = String.valueOf('a');
		str = String.valueOf(true);
		String str2 = 1 + "";
		
		
	/*	
		String str = "   H e l l o   ";
		//양쪽 공백 제거
		System.out.println(str.trim());	// str.trim() : 양쪽 공간의 공백을 제거 해준다..  -> H e l l o
		//모든 공백 제거 
		System.out.println(str.replace(" ", ""));  // replace (" ", "") : " " 공백을 "" 없애라..  모든 공백을 제거
		
		// printf : 화면에 출력 할 경우 사용
		String name = "홍길동";
		int age = 33;
		// static 이 붙은 메서드나 멤버변수는  -> 클래스이름.변수 or 클래스이름.메서드
		//System.out.printf("이름 : %s, 나이 : %d%n", name, age);
		String msg = String.format("이름 : %s, 나이 : %d %n", name, age);	// String.format == printf 
		System.out.print(msg);
	*/	
		
	/*	
		String str = "Hello Java";
		System.out.println(str.replace("l", "")); //str.replace -> 단어교환   // l 을 지워라.  -> Heo Java
		System.out.println(str.replace("l", "e"));	// l 을 e로 바꿔라 -> Heeeo Java
	*/
		
		
	/*
// replace 사용해서 별로 바꾸기.	
		String str1 = "He1l2l4o 7456J6a5v45a";	// Hello Java 사이에 숫자를 추가
//		String str1 = "He1l2l4o 7456J6a5v45a";	// Hello Java 사이에 숫자를 추가
		for (int i = 0; i <= 9; i++) {
			str1 = str1.replace(i + "", "*");	// i 에 해당하는 것들을 *로 바꿔줘 
		}   // str1 에 st1 바뀐값을 대입해줘야 바껴서 출력이 된다..
		System.out.println(str1);
  */
		
		/*
// replace 사용하여  출력..
		String str1 = "안He1l2l녕4o 하7456J세6a5v45a요";	
//		String str1 = 안녕하세요 를 제외한 다른것들은 *로 출력
		for (int i = 0; i <= 9; i++) {
			str1 = str1.replace(i + "", "*");	// i 에 해당하는 것들을 *로 바꿔줘 
		}   // str1 에 st1 바뀐값을 대입해줘야 바껴서 출력이 된다..
		for (char i = 'A'; i <= 'Z'; i++) {
			str1 = str1.replace(i + "", "*");	// i 에 해당하는 것들을 *로 바꿔줘 
		}   // str1 에 st1 바뀐값을 대입해줘야 바껴서 출력이 된다..
		for (char i = 'a'; i <= 'z'; i++) {
			str1 = str1.replace(i + "", "*");	// i 에 해당하는 것들을 *로 바꿔줘 
		}   // str1 에 st1 바뀐값을 대입해줘야 바껴서 출력이 된다..
		System.out.println(str1);
	*/
		
	/*	
		// 정규표현식 사용 가능  replaceAll([범위], 바꿀값)
		String str1 = "안He1l2l녕4o 하7456J세6a5v45a요";	
		str1 = str1.replaceAll("[0-9A-Za-z]", "*");	// [0~9까지, A~Z까지, a~z까지], * 로 바꿔줘
		System.out.println(str1);
	*/	
		
	/*	
		String str1 = "He1l2l4o 7456J6a5v45a";	// Hello Java 사이에 숫자를 추가
//		String str1 = "He*l*l*o ****J*a*v**a";	// 숫자를 *로 바꿔줘
		// str1 의 첫번째부터 끝까지 반복하며 숫자를 *로 바꾼다..
		char[] arr = str1.toCharArray();  // -> str1 을 char배열로 바꿔줘
		String temp = "";
		for (int i = 0; i < arr.length; i++) {	// -> i = 0 부터 arr랭스까지 돌면 처음부터 끝까지 반복..
			if (arr[i] >= '0' && arr[i] <= '9') {	
				temp += "*";
				continue;
			}
			temp += arr[i];
		}
		str1 = temp;
		System.out.println(str1);
	*/
		
	/*	
		String str = "Hello";
		char[] cArr = str.toCharArray();   // -> Char 배열로 바꿔줘
		System.out.println(Arrays.toString(cArr));   //  ->  [H, e, l, l, o]
		
		for (int i = cArr.length -1 ; i >= 0 ; i--) {  // -> 거꾸로 찍을때 이런식으로 표현 할 수 있다.
			System.out.println(cArr[i]);
		}
		
		
		// 내가 필요한 API 를 앞에 선언하고 .을 찍으면 앞에 선언한 배열의 API 부터 보여준다..
		// ex> int[] iArr = str.      byte[] bArr = str.
		byte[] bArr = str.getBytes();  // -> byte 값으로 바꿔줘 
		System.out.println(Arrays.toString(bArr));  // -> 아스킬 코드로 바꿔줌 (byte이기 때문)  -> [72, 101, 108, 108, 111]
		
		byte[] bArr1 = str.getBytes("utf-8"); // 예외처리.. 나중에 다시 배움..
		System.out.println(Arrays.toString(bArr));  
	*/
		
	/*
		String str = "Hello Java";
		str = str.toUpperCase(); 	// -> toUpperCase();  : 대문자로 바꿔줘라..  (str자체는 바뀌지않는다.. 다시 대입해줘야함.)
		System.out.println(str);
		str = str.toLowerCase();	// -> toLowerCase();  : 소문자로 바꿔줘라..
		System.out.println(str);
		System.out.println(str.toUpperCase());
		System.out.println(str);
	*/
	}
}
