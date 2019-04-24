/*
 *  반복문

 *  - for, while, do~while
 *  
 *  for문...
 */
package lec03;

public class Test08 {
	public static void main(String[] args) {
		/*
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		System.out.println(100);
		*/
		
		/*
		 * 	   무한반복
		 *    for (;;)
		 *    	실행할 문장;
		 *    
		 *    
		 *    for (; 조건식;)
		 *    	조건식이 참일 경우 실행할 문장;
		 * 
		 */
		/*
		// 무한반복
		for (;;) 
			System.out.println(100);
		*/	
		
		/*
		int a = 10;
		int i = 1;
		for (; i <= a;) {
			System.out.println(a);
			i++;
		}
		// ??
		System.out.println(i);
		*/
		
		/*
		int a = 10;
		int i = 1;
		while (i <= a) {
			System.out.println(a);
			i++;
		}
		System.out.println(i);
		*/
	
		/*
		 *   for (한번만실행-초기화; 조건식;) {
		 *   
		 *   }
		 *   
		 *   for (한번만실행-초기화; 조건식; 조건식 실행에 처리할일) {
		 *   	실행문장...
		 *   }
		 */
		
		/*
		int a = 10;
		for (int i = 1; i <= a; i++) {
			System.out.println(a);
		}
		*/
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		/*
		int i = 0;   
		i < 3  
		System.out.println(i);  0이 출력
		i++   -> i는 1 
		i < 3  
		System.out.println(i);  1이 출력
		i++   -> i는 2 
		i < 3
		System.out.println(i);  2이 출력
		i++   -> i는 3 
		i < 3  거짓이 되어서 반복을 벗어난다.
		  
		 */
	}
}












