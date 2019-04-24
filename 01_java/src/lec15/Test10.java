package lec15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test10 {
	public static void main(String[] args) {
		
	/*	
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("c"));
		System.out.println("b".compareTo("a"));
		
		System.out.println("김연아".compareTo("아사다마오"));
	*/
	
		Data d1 = new Data("SKY캐슬", 21);
		Data d2 = new Data("킹덤", 11);
		Data d3 = new Data("클래스", 25);
		Data d4 = new Data("말할수없는비밀", 25);
		
		List<Data> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		Collections.sort(list);
		System.out.println(list);

		Data[] arr = {d1, d2, d3, d4};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
