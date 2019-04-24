/*
 *   네이밍 컨벤션 : 이름 규칙


 *   -------------------
 *   클래스 : 첫글자를 대문자로, 단어가 여러개가 나오면 각단어의 첫글자를 대문자로
 *   ex> HelloWorld
 *   변수 : 첫글자를 소문자로, 나머지는 클래스와 동일 
 *   메서드 : 첫글자를 소문자로, 나머지는 클래스와 동일  
 *   ex> speedUp
 *   상수 : 이름을 전부 대문자로, 단어와 단어 사이를 "_" 로 연결
 *   ex> PI;   MAX_VALUE 
 *   
 *   -------------------
 *   클래스
 *   메서드
 *   변수
 *   상수
 *   
 *   중복된 이름은 하나로...
 *   
 *   
 */
package lec02;

public class Test03 {
	public static void main(String[] args) {
		int i = Integer.parseInt("100");
		int j = Integer.parseInt("200");
		System.out.println(i + j);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}












