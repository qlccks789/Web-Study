/**
 *  Set : 중복을 허용하지 않는다. 순서 관리가 되지 않는다.

 *  
 *  대표적인 자식 : HashSet, TreeSet(정렬)
 */
package lec15;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
//		Set<String> set1 = new HashSet<>();
		Set<String> set1 = new TreeSet<>();
		System.out.println(set1.add("one"));
		System.out.println(set1.add("two"));
		System.out.println(set1.add("three"));
		System.out.println(set1);
		System.out.println("크기 : " + set1.size());
		
		System.out.println(set1.add("three"));
		System.out.println("크기 : " + set1.size());
		
		boolean isDel = set1.remove("two");
		System.out.println(isDel ? "삭제되었음" : "삭제실패함");
		set1.add("four");
		set1.add("Five");
		System.out.println(set1);
		
		System.out.println("--------------------");
		for (String data : set1) {
			System.out.println(data);
		}
		
		
	}
}
