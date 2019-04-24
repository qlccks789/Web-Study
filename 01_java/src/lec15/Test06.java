package lec15;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Test06 {
	private static Character makeValue() {
		return "ABCDEFGHIJKLMNOPQRSTYVWXTZabcdefghijklmnopqrstyvwxtz".charAt(new Random().nextInt(52));
	}
	
	public static void main(String[] args) {
		Map<String, Character> data = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			data.put(
					new Random().nextInt(52)+ "", 
					makeValue()
					);
		}
		// map의 모든 데이터를 조회하기...
		// 1. map에 입력된 모든 키를 가져오기
		Set<String> keyList = data.keySet();
		
		// 2. 키의 수 만큼 반복돌면서 map의 데이터를 가져오기
		System.out.println("--------------------");
		for (String key : keyList) {
			System.out.println(
					"key : " + key + ", value = " + data.get(key) 
					);
		}
		System.out.println("--------------------");
	}
}
