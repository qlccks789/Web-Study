/*

*****
 ****
  ***
   **
    *
    
 */
package star;

public class Star05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
