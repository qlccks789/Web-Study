package lec04.quiz;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 *   출력형식>
		 *   
		 *   배열의 모든 요소가 홀수 입니다.
		 *   
		 *   배열의 모든 요소가 홀수는 아닙니다.
		 */		
		int[] arr = {6, 8, 3, 9, 7, 4};
		
		// 1. 홀수의 상태를 보관하기 위한 변수를 선언
		boolean isOdd = true;
		
		// 2. 배열의 모든 요소를 반복하면서 
		//    짝수가 들어있는지 확인한다.
		//    만약, 짝수가 있다면 홀수 상태를 짝수 상태로 변경한다.
		//    더이상 체크하지 않고 반복을 중지한다.
		for (int val : arr) {
			if (val % 2 == 0) {
				isOdd = false;
				break;
			}
		}
		
		// 3. 변수의 값이 홀수 상태라면 "배열의 모든 요소가 홀수 입니다."
		//    아니라면 "배열의 모든 요소가 홀수는 아닙니다."를 출력한다.
		System.out.println(
			isOdd ? "배열의 모든 요소가 홀수 입니다."
				  : "배열의 모든 요소가 홀수는 아닙니다."
		);
		
	}
}











