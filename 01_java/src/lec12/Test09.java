/**
 * 	예외의 메세지 출력하기
 * 
 * 	.printStackTrace();  -> 상세한 에러 메세지 정보를 확인하는 코드
 */

package lec12;

public class Test09 {
	
	private static void call2() {
		System.out.println("call2 메서드");
		System.out.println(1 / 0);	// ArithmeticException
		System.out.println("call2 메서드 종료");
	}
	private static void call() {
		System.out.println("call 메서드");
		call2();
		System.out.println("call 메서드 종료");
	}
	
	
	
	
	
	public static void main(String[] args) {
		try {
			System.out.println("main 시작");
			call();
			System.out.println("main 종료");
		} catch (Exception e) {
			// 예외 메세지를 확인하자
			System.out.println("예외 발생함....");
			String errMsg = e.getMessage();  // 간단한 에러 메세지 정보를 확인
			System.out.println("에러 메세지 : " + errMsg);
			
			//상세한 에러 메세지 정보를 확인
			e.printStackTrace();
			
			// 에러에 대한 출력형태를 조작하자..
			StackTraceElement[] errs = e.getStackTrace();
			System.out.println("--------------------------");
			System.out.println("파일명 클래스명 메서드명 줄번호");
			System.out.println("--------------------------");
			for (StackTraceElement ste : errs) {
				System.out.printf("%s %s %s %d%n", 
						ste.getFileName(),
						ste.getClassName(),
						ste.getMethodName(),
						ste.getLineNumber()
						);
			}
			System.out.println("--------------------------");
			
		}
	
	}
}
