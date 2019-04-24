package lec04;

import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
		// 배열의 내용을 확인하는 방법 3가지..
		int[] arr = {10, 20, 30};
		
		// 1번 방식
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------------------");
		
		// 2번 방식 : 향상된 for(1.5 버전에서 추가), 처음부터 마지막까지 요소 확인..
		for (int val : arr) {
			System.out.println(val);
		}
		System.out.println("--------------------");
		// 3번 방식 : 단순하게 배열의 요소가 어떤게 들어가 있는지 확인만 할 경우
		// Arrays.toString(배열명) <- 메서드 활용
		String result = Arrays.toString(arr);
		System.out.println(result);
		
		System.out.println(Arrays.toString(arr));
		
	}
}










