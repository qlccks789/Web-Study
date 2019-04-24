/*

*
**
***
****
*****

아래 여러가지 방식으로 풀어봤습니다. 참고하세요~

 */
package lec03.homework;

public class Star2 {
	public static void main(String[] args) {
		int line = 5;
		for (int i = 1; i <= line; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String star = "*";
		for (int i = 1; i <= line; i++) {
			System.out.println(star);
			star += "*";
		}
		
		star = "*";
		for (int i = 1; i <= line; i++, star += "*") {
			System.out.println(star);
		}
		
		star = "";
		for (int i = 1; i <= line; i++) {
			System.out.println(star += "*");
		}	
	}
}
