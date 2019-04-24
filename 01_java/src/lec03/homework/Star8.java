/*

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *    
        
 */
package lec03.homework;

public class Star8 {
	public static void main(String[] args) {
		int line = 5;
		for (int cnt = 1; cnt < line * 2; cnt++) {
//			System.out.println(cnt);
			// 위쪽 별찍기 - line 까지 진행
			String star = "";
			if (cnt <= line) {
				for (int i = 0; i < line - cnt; i++) {
					star += " ";
				}
				for (int i = 1; i < cnt * 2; i++) {
					star += "*";
				}
				System.out.println(star);
				continue;
			}
			
			// 아래쪽 별찍기 - line 보다 커질경우
			for (int i = line; i < cnt; i++) {
				star += " ";
			}
			for (int i = 1; i < (line * 2 - cnt) * 2; i++) {
				star += "*";
			}
			System.out.println(star);
		}
	}
}












