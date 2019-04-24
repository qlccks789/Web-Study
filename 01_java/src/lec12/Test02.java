/**
 * 	예외 : Exception 이 대상임.
 * 
 * 	- 프로그램에서 처리가 가능한 것.
 * 	- 예외와 관련된 핵심 예약어
 * 		: try, catch, finally, throws, throw
 * 	- 예외의 처리 방식
 * 		: 직접처리방식 : try, catch, finally
 * 		: 간접처리방식 : throws 
 *  - 자바의 예외는 클래스로 정의되어 있다.
 *   Object
 *   
 *   Throwable
 *   
 *   Exception		Error(프로그램에서 처리 불가능, 심각한 에러)
 *   
 *   RuntimeException 		그외..(컴파일시 예외가 체크됨 : checkedException)
 *   
 *   - 사용자가 예외를 직접 정의 할 수 있다.(예외관련 클래스 상속함)
 *   
 *   - 개발자가 코드상의 특정 시점에 예외를 발생시킬 수 있다. (throw)
 */

package lec12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("a.txt");
		// Unhandled exception type FileNotFoundException
		// RuntimeException을 상속받지 않은 클래스들
		// 컴파일 시점 예외 발생 : checkedException
		Scanner sc = new Scanner(f);	
		
		String msg = null;
		// RuntimeException 상속받은 클래스들
		// 런타임 시점에 예외 발생 : uncheckedException
		System.out.println(msg.length());
				
	}
}
