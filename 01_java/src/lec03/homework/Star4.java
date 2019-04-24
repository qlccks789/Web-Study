/*

    *
   **
  ***
 ****
*****

 */
package lec03.homework;

public class Star4 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5 - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 방법 2.
		String star = "";
		for (int i = 1 ; i <= 5 ; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");	//공백입력
			}
			star += "*";			//*문자의 갯수를 하나씩 늘려줌
			System.out.println(star);
		}		
	}
}
