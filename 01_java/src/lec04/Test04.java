
package lec04;

public class Test04 {
	public static void main(String[] args) {
		int[] iArr = new int[3];
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		
		// 배열을 선언과 동시에 특정 값으로 초기화하자..
//		int[] iArr2 = {}; // new int[0] 
		int[] iArr2 = {10, 20, 30}; // 위의 코드와 동일
		
		for (int i = 0; i < iArr2.length; i++) {
			System.out.println(iArr2[i]);
		}
		
		// 위의 방식은 배열을 선언할 때 밖에 사용이 불가능하다.
		int[] iArr3;  // 선언
//		iArr3 = {1, 2, 3};   // 에러 발생, 선언 이후에는 불가능
		
//		int index = 0;
//		iArr[index++] = 10;
//		iArr[index++] = 20;
//		iArr[index++] = 30;
		
		
	}
}




