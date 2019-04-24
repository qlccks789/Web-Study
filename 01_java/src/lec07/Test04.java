package lec07;

import java.util.Arrays;

import lec.util.StringUtil;

public class Test04 {
	public static void main(String[] args) {
	
		
		// 문자열 찾기
		String str = "Hello Java";
		
		// indexOf : 앞쪽부터 찾기   lastIndexOf : 뒤쪽부터 찾기
		int ind = str.indexOf("llo");	// 2	
		System.out.println(ind);	
		ind = str.indexOf("a");		// 7
		System.out.println(ind);		
		ind = str.indexOf("Je");	// 못 찾을경우 :	-1   -> -1이 나올  땐 못찾았을때다..
		System.out.println(ind);	
		ind = str.indexOf("a", 8);
		System.out.println(ind);	// 9
		
		// 뒤쪽부터 찾는다.
		ind = str.lastIndexOf("a");	// 9	
		System.out.println(ind);	
		// 8번째 인덱스부터 뒤에서 앞으로 이동하면서 "a" 를 찾아라.. (8 -> 7 -> 6 ...0)
		ind = str.lastIndexOf("a", 8);	// 7	
		System.out.println(ind);	
		
		// str의 내용에 "llo" 의 내용이 포함되어 있는지 확인
		System.out.println(str.contains("llo"));	// true
		
		
		// 문자열 추출하기 : 일부 문자열 가져오기
		str = "Hello Java";
		// str의 3번째 인덱스위치부터 마지막까지 추출하라...
		String msg = str.substring(3);
		System.out.println(msg);  // lo Java
		// str의 2번째인덱스부터 3번째 인덱스까지 추출하라...
		// endIndex는 포함되지 않는다.  
		msg = str.substring(2, 4);  // -> exdIndex 는 포함하지 않기때문에 +1 해줘야한다..  2번쨰부터 3번째까지 짜르고싶으면 (2, 4)
		System.out.println(msg);	// ll
		
		str = "홍길동:22:서울특별시 마포구:hong@a.com";
		// regex : regular expression (정규표현식)
		String[] result = str.split(":");
		System.out.println(Arrays.toString(result));
		
	/*	
		StringUtil su = new StringUtil();
		// arr[0] -> 홍길동
		// arr[1] -> 22
		// arr[2] -> 서울특별시 마포구
		// arr[3] -> hong@a.com
//		String a = "홍길동:22:서울특별시 마포구:hong@a.com";
//		String b = ":";
//		a.indexOf(b)  -> 3
//		a.substring(3) -> 홍길동
		String[] arr = su.split("홍길동:22:서울특별시 마포구:hong@a.com", ":");
		// : 기준으로 문자열 추출 
	*/	
		
		
		
		/*
		String str = "hello";
		boolean bool = str.startsWith("he");
		System.out.println(bool);
		System.out.println(str.endsWith("llo"));
		System.out.println(str.equals("hello"));
	
		
		// 대소문자 무시하고 내용 비교
		System.out.println(str.equals("Hello"));	// false
		System.out.println(str.equalsIgnoreCase("Hello"));	// true
									// 대소문자 무시
		
		
		
		
		
		String quit = "y";
		
		switch (quit) {
		case "y" :
		case "Y" :
			break;
		}
		
		if (quit.equals("Y") || quit.equals("y")) {
			
		}
		
		if (quit.equalsIgnoreCase("y")) {
			
		}
		*/
	}
}
