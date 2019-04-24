/*
 *   연산자1 - 조건 연산자, 삼항 연산자( 조건(참,거짓) ? 값 : 값 ) 

 *   
 *   (조건) ? 참일 경우 값 : 거짓일 경우 값   ->  결과값
 *   
 *   2 * 5  ->  10
 *   
 *   +5 -> 단항연산자
 *   1 * 10 -> 이항 연산자
 */
package lec02;

public class Test09 {
	public static void main(String[] args) {
		int result = 10 > 5 ? 10 : 5;  // 결과는 10
		System.out.println(result);
		
		System.out.println(10 > 5 ? 10 : 5);
		System.out.println(10 < 5 ? 10 : 5);
		
		String msg = 10 > 5 ? "참" : "거짓";
		System.out.println(msg);
		
		int score = 77;
		// score 점수에 따라서 수, 우, 미 를 화면에 출력
		/*
		 *   score가 90보다 크거나 같다면 수를 결과처리하고
		 *   score가 90보다 작다면 
		 *   score가 80보다 크거나 같다면 우를 결과처리하고
		 *   score가 80보다 작다면 미를 결과처리
		 */
		String scoreMsg = score >= 90 ? "수" : 
						  score >= 80 ? "우" : "미";
		System.out.println(scoreMsg);
		                              
	}
}










