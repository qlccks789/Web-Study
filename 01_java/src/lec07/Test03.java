package lec07;

import java.util.Scanner;

import lec.util.StringUtil;

public class Test03 {
	public static void main(String[] args) {
		String str = "Hello";
		
		// char	charAt(int index)
		char ch = str.charAt(0);	// H
		System.out.println(ch);
		ch = str.charAt(1);			// e
		System.out.println(ch);
		
		System.out.println(str.charAt(4));	// o
		
		// int	length()
		int len = str.length();
		System.out.println("문자열의 길이 : " + len);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요 : ");
		String input = sc.nextLine();
		
		StringUtil su = new StringUtil();
		String reverseStr = su.reverse(input);
		System.out.println(reverseStr);
		
		
//		   input -> 안녕하세요	
//		      거꾸로 출력하는 코드 작성 -> 요세하녕안
//		int len1 = input.length();
//		for (int i = input.length()-1; i >= 0; i-- ) {
//			System.out.print(input.charAt(i));
//		}
		
		boolean bool = su.startsWith("hello", "he");
		System.out.println(bool); 	// true
		bool = su.startsWith("hello", "hek");
		System.out.println(bool);	// false
		
		System.out.println(su.startsWith("he", "hello"));
		
		System.out.println(su.endsWith("hello", "llo"));  //true
		System.out.println(su.endsWith("hello", "lla"));  //false
		
		
		
		System.out.println(su.equals("hello", "hella"));  //false
		System.out.println(su.equals("hello", "hello"));  //true
		
	}
}
