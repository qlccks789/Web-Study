package lec15;

import java.util.ArrayList;
import java.util.Arrays;

public class Test08 {
	public static void main(String[] args) {
		Data d1 = new Data(3);
		Data d2 = new Data(9);
		Data d3 = new Data(7);
		
		System.out.println(d1);
		
		Data[] arr = {d1, d2, d3};
		
		// 3 7 9 순서로 나오도록 만들기..
		
		
	/*	
		Data[] arr = {d1, d2, d3};
		for(int i = 0; i < arr.length-1 ; i ++) {
			int ind = i;
			for(int j = i+1; j < arr.length; j++) {
				if (arr[i].getNum() > arr[j].getNum()) {
					ind = j;
				}
				
			}
			Data temp = arr[ind];
			arr[ind] = arr[i];
			arr[i] = temp;
		}
		
		
		System.out.println(Arrays.toString(arr));
	*/	
		
	}
}
