/**
 * 	직접 + 간접
 * 
 *  예외의 강제 생성 : throw
 *  
 *  throw 예외객체를 설정한다.
 *  
 *  throw e;				 // e라는 변수에 예외객체가 이미 있는 경우
 *  throw new Exception();   // 예외객체 직접 생성
 */


package lec12;

import java.io.File;
import java.util.Scanner;

class staff {
	public void work() throws Exception{
		try {
			Scanner sc = new Scanner(new File("money.txt"));
			
		} catch (Exception e) {
			System.out.println("알바생이 문제에 대해서 인식한다..");
			
			// 사장에게 예외를 알려주기 위해서
		    // 강제로 예외를 발생시킨다.
//			throw new Exception("사장님 문제가 발생했어요...");  //  -> 직접 예외 객체를 생성하는 방식
			throw e;    // -> 생성된 예외 객체가 있는 경우
		}		
	}
}

class Boss {
	public void manage() {
		staff s = new staff();
		try {
			s.work();			
		} catch (Exception e) {
			System.out.println("사장이 문제에 대해 정리한다.");
		}
	}
}


public class Test11 {
	public static void main(String[] args) {
		Boss boss = new Boss();
		boss.manage();
	}
}
