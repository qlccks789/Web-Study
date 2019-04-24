/**
 *  	다중 catch 블럭 선언하기

 *  
 *  - 부모 타입과 자식 타입을 동시에 선언해야 하는 경우
 *  - 부모 타입이 자식 타입보다 밑에 선언되어야 한다.
 */
package lec12;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;


public class Test06 {
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
		} catch(NullPointerException ne) {		
			errorProcess();
		} catch(ArithmeticException ae) {		
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
