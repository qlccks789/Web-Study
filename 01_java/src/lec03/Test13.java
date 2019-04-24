package lec03;

public class Test13 {
	public static void main(String[] args) {
		/*
		 *   break : switch 블럭 빠져나가기, 반복문 블럭 빠져나가기
		 *   continue : 반복문과 같이 사용, 반복처리할 내용을 스킵한다.
		 */
		/*
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		*/
		
		outer :
		for (int k = 0; k < 2; k++) {
			System.out.println("k = " + k);
			for (int i = 0; i < 3; i++) {
				if (i == 1) {
					continue outer;
				}
				System.out.println("i = " + i);
			}
		}
		
	}
}









