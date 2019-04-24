/**
 * 	객체의 비교를 위한 인터페이스(주로 정렬시 사용)

 * 	 - Comparable Interface 
 */
package lec15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test09 {
	public static void main(String[] args) {
		Data d1 = new Data(3);
		Data d2 = new Data(9);
		Data d3 = new Data(7);
				
		Data[] arr = {d1, d2, d3};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		List<Data> list = new ArrayList<>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
