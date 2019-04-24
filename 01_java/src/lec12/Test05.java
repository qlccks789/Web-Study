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


public class Test05 {
	public static void main(String[] args) {
		File f = new File("a.txt"); 
		try {
			System.out.println(1);
			//FileNotFoundException
			Scanner sc = new Scanner(f);
			
			System.out.println(2);
			
			String s = null;
			
			s = "a";
			// NullPointerException
			int len = s.length();
			
			System.out.println(3);
			
			System.out.println(1 / 0);  // 예외처리 해야함
			
			// 다중 catch 블럭 선언.
			// 여러개가 선언되는 다중 catch 블럭일 때에는 부모타입이 자식타입보다 하위에 선언되어야한다.
			// 이유 : 부모가 앞에서 다 처리하기 때문에..
		} catch(FileNotFoundException fnfe) {		
			System.out.println("파일이 없는 경우의 예외처리");
		} catch(Exception e) {	
			System.out.println(4);
		}
	
	}
}
