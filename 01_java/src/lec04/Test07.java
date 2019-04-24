package lec04;

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		// 배열의 복사 : 얕은 복사, 깊은 복사
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("1. 얕은 복사 ");
		int[] arr2 = arr;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		arr2[2] = 30;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("2. 깊은 복사");
		int[] arr3 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr3));
		
		arr3[3] = 100; 

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr3));

		System.out.println("3. API를 활용한 배열 복사");
		int[] arr4 = new int[arr.length];
//		System.arraycopy(arr, 1, arr4, 2, 3);
		// 전체 복사..
		System.arraycopy(arr, 0, arr4, 0, arr.length);
		System.out.println(Arrays.toString(arr4));
	}
}
























