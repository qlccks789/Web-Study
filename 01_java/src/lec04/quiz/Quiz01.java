package lec04.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 9, 7, 4};
		/*
		 *   출력형식>
		 *   최댓값 : 9
		 *   최솟값 : 3
		 */
		// 1. 최대값과 최소값을 담을 변수를 선언한다.
		// 2. 선언된 변수에 배열의 첫번째 요소의 값을 대입한다.
		int max = arr[0], min = arr[0];
		
		// 3. 배열의 두번째 요소부터 최대값, 최소값과 비교한다.
		for (int i = 1; i < arr.length; i++) {
			// 4. 만약, 배열의 요소가 최대값 보다 크다면 최대값을 배열의 요소로 변경한다.
			//    배열의 요소가 최소값 보다 작다면 최소값을 배열의 요소로 변경한다.
			if (max < arr[i]) max = arr[i];
			if (min > arr[i]) min = arr[i];
		}
		
		// 5. 최대값과 최소값을 화면에 출력한다. 
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
	}
}









