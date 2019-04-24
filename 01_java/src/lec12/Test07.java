/**
 *  multi catch 블럭 선언하기
 *  
 *  - 여러개의 예외들을 하나의 catch 로 묶어서 처리할 수 있다.
 *  - 1.7 버전 부터 지원되는 문법
 */
package lec12;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Test07 {
	public static void main(String[] args) {
		File f = new File("a.txt"); 
		try {
			System.out.println(1);
			Scanner sc = new Scanner(f);
			System.out.println(2);
			
			String s = null;
			s = "a";
			// NullPointerException
			int len = s.length();
			System.out.println(3);
			// ArithmeticException : 정수를 0 으로 나누는 경우에 발생하는 에러
			System.out.println(1 / 0);  
			
			// 다중 catch 블럭 선언.
			// 여러개가 선언되는 다중 catch 블럭일 때에는 부모타입이 자식타입보다 하위에 선언되어야한다.
			// 이유 : 부모가 앞에서 다 처리하기 때문에..

		} catch(FileNotFoundException fnfe) {		
			System.out.println("파일이 없는 경우의 예외처리");
		} catch(NullPointerException | ArithmeticException ne) {	// -> 중간에 | 로 두개를 묶을 수 있다. : multi catch 블락	
			errorProcess();
		} catch(Exception e) {	
			System.out.println("이외의 모든 예외를 처리한다.");
		}
	
	}
	
	private static void errorProcess() {
		System.out.println("*******************");
		System.out.println("예외 발생..");
		System.out.println("*******************");
	}
}
