package lec15;

import java.util.Arrays;
import java.util.Comparator;

public class Test11 {
	public static void main(String[] args) {
		Data d1 = new Data("SKY캐슬", 21);
		Data d2 = new Data("킹덤", 11);
		Data d3 = new Data("클래스", 25);
		Data d4 = new Data("말할수없는비밀", 25);
		
		Data[] arr = {d1, d2, d3, d4};
		Arrays.sort(arr, new Comparator<Data>() {
							// 새로운 기준의 정렬을 설정하고 싶을 때 new Comparator<>() {} 선언.. 오버라이딩에 조건추가..
			@Override	// 내부클래스 , 익명 클래스
			public int compare(Data o1, Data o2) {
				return o1.getNum() - o2.getNum();
			}
			
		});
		System.out.println(Arrays.toString(arr));
	}
}
