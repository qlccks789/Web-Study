/*

*********
 *******
  *****
   ***
    *

 */
package star;

public class Star07 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int k = i * 2; k < 9; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
