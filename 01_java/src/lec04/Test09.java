package lec04;

import java.util.Arrays;

public class Test09 {
	public static void main(String[] args) {
		boolean[][] arr = new boolean[2][];
		arr[0] = new boolean[3];
		arr[1] = new boolean[2];
		
		for (int i = 0; i < arr[1].length; i++) {
			arr[1][i] = true;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}















