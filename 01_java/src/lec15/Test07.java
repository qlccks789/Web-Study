package lec15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07 {
	public static void main(String[] args) {
		
	/*	
	 	//Collections 이용하여 정렬 연습..
	 	 
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(9);
		Collections.sort(list);   // Collections.sort();  --> 오름차순으로 정렬 해주는 것 ..
		System.out.println(list);
		
		Collections.shuffle(list);	// shuffle  섞는것..
		System.out.println(list);
		
		Collections.reverse(list);	// 거꾸로 
		System.out.println(list);
		
		Collections.swap(list, 1, 3); // index 의 1번쨰와 3번쨰 자리의 값을 스왑한다.
		System.out.println(list);
	*/
		
		
	/*
	 	// 오름차순 정렬해주는 API 활용..   (sort)
	 	 
		int[] arr = {5, 3, 7, 1, 9};
		Arrays.sort(arr);		// 오름차순 정렬 해주는 것..    sort
		System.out.println(Arrays.toString(arr));
	*/	
		
		
	/*	
		// 직접 정렬 알고리즘으로 풀어쓰기..
		 
		int[] arr = {5, 3, 7, 1, 9};
		// 선택정렬
		for (int i = 0; i < arr.length-1; i++) {
			int ind = i;
			for (int k = i+1; k < arr.length; k++) {
				if (arr[ind] > arr[k]) {
					ind = k;
				}
			}
			int temp = arr[ind];
			arr[ind] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	*/
	
	
	}
}
