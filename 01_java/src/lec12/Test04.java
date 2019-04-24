/**
 * 	catch 블럭의 선언되는 데이터 타입은 try 블럭에서 발생되는 예외를 받을 수 있는 클래스를 선언해야 한다.

 *  catch 블럭에 선언되는 데이터 타입은 반드시 Throwable 의 하위 클래스들이 와야 한다.
 * 
 *  
 */
package lec12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//class MyTest {}
//class MyTest extends FileNotFoundException {}

public class Test04 {
	public static void main(String[] args) {
		File f = new File("a.txt");  // 프로젝트 밑에 파일이 존재해야 한다.
		try {
			System.out.println(1);
			// FileNotFoundException
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			System.out.println(2);
			// No exception of type MyTest can be thrown; an exception type must be a subclass of Throwable
			
//		} catch(MyTest fnfe) { 	
//		} catch(IOException fnfe) {	
//		} catch(Exception fnfe) {	
//		} catch(Throwable fnfe) {	
		} catch(FileNotFoundException fnfe) {	
//		} catch(Object fnfe) { 		-> Throwable 자식 타입이 아니므로 Object는 올 수 없다.	
			// 실질적인 예외처리 하기
			System.out.println(3);
		}
	}
}
