package lec15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Quiz01 {
	private static void testAlg04() {
		List<Integer> balls = new ArrayList<>();
		for (int i = 1; i <= 45; i++) {
			balls.add(i);
		}
		
		Collections.shuffle(balls);
		for (int i = 0; i < 6; i++) {
			System.out.print(balls.get(i) + " ");
		}
	}
	
	private static void testAlg03() {
		final int MAX = 45;
		int[] ball = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			ball[i] = i + 1;
		}
		
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int index = r.nextInt(MAX - i);
			lotto[i] = ball[index];
			ball[index] = ball[MAX - i - 1];
		}
		System.out.println(Arrays.toString(lotto));
	}
	
	private static void testAlg02() {
		final int MAX = 45;
		int[] ball = new int[MAX];
		for (int i = 0; i < MAX; i++) {
			ball[i] = i + 1;
		}
		
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			int index = r.nextInt(MAX);
			int temp = ball[index];
			ball[index] = ball[0];
			ball[0] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + "\t");
		}
//		System.out.println(Arrays.toString(ball));
	}
	
	private static void testAlg01() {
		// 로또 번호 중복되지 않게 6개 만들기
		Random r = new Random();
		int [] arr = new int[6];
		outer:
		for (int i = 0; i < arr.length; ) {
			int val = r.nextInt(45) + 1;
			
			// 배열의 i 번째 앞의 요소들의 값을 찾아서 val과 같은지 체크
			// 만약 같은 값이 있다면 다시 반복해서 값을 생성, i의 값이 변경되지 않아야 한다.
			for (int k = 0; k < i; k++) {
				if (arr[k] == val) continue outer;
			}
			
			arr[i++] = val;
		}
		System.out.println(Arrays.toString(arr));
	}
	private static void testSet() {
		// Set 을 활용한 로또번호 6개를 생성 후 화면에 출력
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}
		System.out.println(set);
	}
	public static void main(String[] args) {
//		testSet();
//		testAlg01();
//		testAlg02();
//		testAlg03();
		testAlg04();
	}
}










