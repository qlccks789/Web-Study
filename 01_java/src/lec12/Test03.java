/**
 * 	예외의 직접 처리 방식 이해하기
 * 
 * try 
 * 		- 예외가 발생할 수 있는 코드를 묶는 블럭
 * 
 * catch 
 * 		- try 블럭에서 예외가 발생했을 경우에만 실행됨.
 * 		- catch 는 try와 항상 같이 사용해야 한다.
 * 		- 형태 : catch(변수선언) {}
 * 		- 변수선언 위치에 들어갈 데이터 타입은 try 블럭에서 발생되는 예외클래스를 받을 수 있는 예외클래스 타입을 선언한다. (자신 + 부모)
 * 
 * try 블럭에서 예외가 발생했을 경우
 * 발생된 예외를 받을 수 있는 catch 블럭을 찾는다.
 * catch 블럭으로 이동해서 블럭에 있는 코드를 수행한다.
 * 
 * 
 * finally
 * 
 */
package lec12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {
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
		} catch(FileNotFoundException fnfe) {
			// 실질적인 예외처리 하기	// 예외처리 할게 없으면 실행이 안된다.
			System.out.println(3);
		}
	}
}
