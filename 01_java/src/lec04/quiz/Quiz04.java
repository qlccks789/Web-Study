package lec04.quiz;

import java.util.Arrays;
import java.util.Random;

public class Quiz04 {
	public static void main(String[] args) {
		/*
		 *   1. 랜덤한 수(1 - 20) 숫자를 10개 생성해서 배열에 입력한다.
		 */
		int [] arr = new int[10];

		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(20) + 1;
		}
		
		// 2. 랜덤한 수(1 - 20) 사이의 수 한개를 생성해서 변수에 입력
		int num = r.nextInt(20) + 1;
		
		// 3. 2번과정에서 생성된 수보다 큰 배열에 있는 숫자들합을 구한 후
		int sum = 0;
		for (int val : arr) {
			if (num >= val) continue;
			
			sum += val;
		}
		
		// 4. 화면에 출력한다.
		//    1) 생성된 배열의 요소 출력 : Arrays.toString 
		//    2) 2번 과정에서 생성된 수를 출력
		//    3) 수의 합 : ?? 
		System.out.println("배열요소 " + Arrays.toString(arr));
		System.out.println("생성된 수 : " + num);
		System.out.println("수의 합 : " + sum);
	}
}
