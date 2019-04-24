/**
 *  finally : 예외 발생여부와 상관없이 실행해야 하는 문장들을 묶는다.
 *   - 외부자원의 사용을 닫는 작업..
 *   - 파일 사용, 데이터베이스 연결 닫기, 네트워크 닫기... 
 *   
 */
package lec12;

public class Test08 {
	public static void main(String[] args) {
		
		
		try {
			System.out.println(1);
			String s = null;
			int len = s.length();
			System.out.println(2);					
		} catch (Exception a) {
			System.out.println(3);		// 오류가 났을때만 수행 된다.
//			return;			// -> return 이 와도 finally는 수행된다.  1 - 3 - 4 
			System.exit(0);  // -> 이때는 finally를 수행하지 않는다.    1 - 3 
		} finally {
			System.out.println(4);		// finally 는 무조건 수행된다.
		}
		System.out.println(5);
		
		
		/*
		try {
			System.out.println(1);
		} finally {
			System.out.println(2);
			
		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			
		try {
			System.out.println(3);
			
		} catch (Exception a) {
			System.out.println(4);
			
		} finally {
			System.out.println(5);
			
		}
	
	*/
	
	
	}
}
