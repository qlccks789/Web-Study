/*

*********
 *******
  *****
   ***
    *

 */
package lec03.homework;

public class Star7 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j < (5 - i) * 2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
