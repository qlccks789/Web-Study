/**
 * JSON : 배열([]), 객체({})
 * 
 * - 키와 값의 쌍으로 되어 있음
 * - 키는 반드시 ""으로 묶여 있어야 한다.
 * - [] -> 자바에서 배열 또는 리스트로 변경
 * - {} -> 자바에서 VO 클래스로 변경
 * 
 * {
 * 	  name: "홍길동" (X) - name이 ""로 묶여 있어야 한다.
 * }
 * 
 * {
 * 	  "name": "홍길동",
 *    "age": 11
 * }
 * -> 자바에서 받는 경우
 * class Member {
 * 	  private String name;
 *    private int age;
 * }
 * 
 * 
 * [
 * 	  "aaa",
 *    "bbb"
 * ]
 * -> 자바로 변경
 * List<String> list;
 * 
 * {
 * 	  "name": "쇼핑하라",
 *    "hobbys": ["직방", "쇼핑", "먹기"]
 * }
 * ->
 * class Member {
 * 	  String name;
 *    List<String> hobbys;
 * }
 * 
 * {
 * 	  "name": "이수",
 *    "addr": {"basic": "서울", "detail": "강남구"},
 *    "hobbys": ["운동", "음악"]
 * }
 * 
 * class Member {
 * 		String name;
 * 		Address addr;
 * 		List<String> hobbys;
 * }
 * 
 * class Address {
 * 		String basic;
 * 		String detail;
 * }
 * 
 * {
 * 	   "name": "성공하자",
 *     "addr": {"basic": "서울", "detail": "강남구", "postno": "123-123"},
 *     "hobbys": [1, 2, 3],
 *     "items": [
 *     				{"name": "시계", "price": 100100},
 *     				{"name": "차", "price": 5000100}
 *              ]
 * }
 * 
 * class Member {
 * 		String name;
 * 		Addr addr;
 * 		List<Integer> hobbys;
 * 		List<Item> items;
 * }
 * class Addr {
 * 		String basic;
 * 		String detail;
 * 		String postno;
 * }
 * class Item {
 * 		String name;
 * 		int price;
 * }
 */
package net05.json;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Test01 {
	private static void test01() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		
		// 위 클래스의 정보를 json 형태로 변환하라..
		String data = "{\"name\": \"" + m.getName() + "\", \"age\": " + m.getAge() + "}";
		System.out.println(data);
	}

	private static void test02() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		
		// 위 클래스의 정보를 json 형태로 변환하라..
		/*
		Gson gson = new Gson();
		String data = gson.toJson(m);
		System.out.println(data);
		*/
		
		System.out.println(new Gson().toJson(m));
	}
	
	private static void test03() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		
		// 리스트 타입 추가 확인하기..
		List<String> hobbys = new ArrayList<>();
		hobbys.add("음악감상");
		hobbys.add("영화감상");
		m.setHobbys(hobbys);
		
		System.out.println(new Gson().toJson(m));
	}
	
	private static void test04() {
		Member m = new Member();
		m.setName("예지");
		m.setAge(8);
		List<String> hobbys = new ArrayList<>();
		hobbys.add("음악감상");
		hobbys.add("영화감상");
		m.setHobbys(hobbys);
		
		// Address 클래스를 추가 테스트
		Address addr = new Address();
		addr.setBasic("제주특별자치도");
		addr.setDetail("서귀포시");
		m.setAddr(addr);
		
		System.out.println(new Gson().toJson(m));
	}
	
	private static void test05() {
		String data = "{\"name\":\"예지\",\"age\":8,\"hobbys\":[\"음악감상\",\"영화감상\"],\"addr\":{\"basic\":\"제주특별자치도\",\"detail\":\"서귀포시\"}}";
		System.out.println(data);
		
		Member m = new Gson().fromJson(data, Member.class);
		System.out.println("이름 : " + m.getName());
		System.out.println("나이 : " + m.getAge());
	}
	
	public static void main(String[] args) {
		// 객체 -> JSON
//		test01();  // 직접변환 : 고생이 많다.
//		test02();  // GSON : 역쉬.. 구글이야..
//		test03();
//		test04();
		// JSON -> 객체
		test05();
	}
}










