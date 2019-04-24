package lec04.quiz;

import java.util.Arrays;

public class Quiz07 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 1, 9, 7, 4};
		// arr 배열의 요소를 꺼꾸로 저장한다.
		// 0, 5  -> arr.length - 1 - 0
		// 1, 4  -> arr.length - 1 - 1
		// 2, 3  -> arr.length - 1 - 2
		for (int i = 0; i < arr.length / 2; i++) {
			int loc = arr.length - 1 - i;
			int temp = arr[i];
			arr[i] = arr[loc];
			arr[loc] = temp;     
		}
		
		// 4, 7, 9, 3, 8, 6
		System.out.println(Arrays.toString(arr));
	}
}






















