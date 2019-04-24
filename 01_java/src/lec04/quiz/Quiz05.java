/*
 * 아래와 같이 동작하는 프로그램을 작성하시오
 * 
 * - 정수 데이터를 5개 담을 수 있는 배열을 생성합니다.
 * - 배열의 초기값으로 랜덤하게 1 - 10 사이의 수를 입력합니다.
 * 
 * - 배열의 입력된 값을 화면에 출력합니다.
 * - 배열에 입력된 값들의 합을 화면에 출력합니다.
 * - 배열에 입력된 값들의 평균을 화면에 출력합니다.
 * - 배열에 입력된 값 중에서 최댓값을 화면에 출력합니다.
 * - 배열에 입력된 값 중에서 최솟값을 화면에 출력합니다.
  
        출력형식 >
  
    [8, 5, 7, 3, 6]
	합계 : 29
	평균 : 5.80
	최댓값 : 8
	최솟값 : 3
 */
package lec04.quiz;

import java.util.Arrays;
import java.util.Random;

public class Quiz05 {
	public static void main(String[] args) {
		Random r = new Random();

		// 배열 생성 및 랜덤한 값 설정
		int arr[] = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1; 
		}

		int sum = arr[0], min = arr[0], max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) min = arr[i];
			if (max < arr[i]) max = arr[i];
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f\n", (double)sum / arr.length);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);		
	}
}









