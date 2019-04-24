/*
 *   사용자의 입력을 받아보자..

 *   Scanner 
 */
package lec03;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// The constructor Scanner() is undefined
		Scanner sc = new Scanner(System.in);
		// 스캐너가 읽겠습니다.(표준 입력창을 통해서)
		// 줄단위로 읽겠습니다.
		System.out.println("이제부터 정보를 받아들입니다.");
		System.out.print("당신의 이름 : ");
		String name = sc.nextLine();
		System.out.print("당신의 나이 : ");
		String age = sc.nextLine();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}














