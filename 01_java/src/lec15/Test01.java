package lec15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 추가
		list.add("일");
		list.add(0, "이");	// 0번째 인덱스에 "이" 를 추가해라..
		list.add("삼");
		
		// 입력된 크기
		list.size();
		System.out.println("크기 : " + list.size());
		
		// 리스트의 0번째 요소를 삭제
		list.remove(0);
		
		// 삭제된 이후의 크기 출력
		System.out.println("크기 : " + list.size());
		
		// 요소를 확인하기 위해 리스트 객체 자체 출력
		System.out.println(list);
		
		// 리스트에 "삼"의 값이 포함되어 있는지 확인
		boolean bool = list.contains("삼");
		System.out.println(bool ? "삼이 포함" : "삼이 포함되어 있지 않다.");
		
		// 리스트에 "삼"이 들어있는 인덱스 위치를 화면에 출력
		int num = list.indexOf("삼");
		System.out.println("삼이 들어있는 인덱스 위치 : " + num);
		
		// 리스트에 인덱스가 비어있는지 아닌지 확인..
		boolean empty = list.isEmpty();
		System.out.println(empty ? "비어있음" : "비어있지 않음");
		
			
			
		list = new LinkedList<>();
		
		
		
		
		
		
	}
}
