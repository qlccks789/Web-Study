package lec04.quiz;

import java.util.Arrays;

public class Quiz06 {
	public static void main(String[] args) {
		int[] arr = {6, 8, 3, 9, 7, 4};
		
		// 요소 위치 바꾸기
		// swap
		
		int temp = arr[2];  // 3
		arr[2] = arr[4];    // 7
		arr[4] = temp;      // 3
		
		System.out.println(Arrays.toString(arr));
		
	}
}









