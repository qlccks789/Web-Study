package lec04;

public class Test08 {
	public static void main(String[] args) {
		// 이차원 배열
		int[][] arr = new int[3][];
		System.out.println(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		/*
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);

		System.out.println(arr[1][0]);

		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr[2][2]);
		*/
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(
						"i : %d, j : %d, %d%n", i, j, arr[i][j]);
			}
		}
	}
}









