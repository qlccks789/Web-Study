/**
 * 	Map

 * 	
 * 	검색과 수정, 삭제.. 효율적이다.
 * 
 * 	KEY, VALUE 를 같이 관리한다.
 * 
 * 	put(K, V)  : 값을(데이터를) 입력할 때 사용.
 *  get(K) 	   : 값을 추출하고자 할 때 쓴다. V값을 반환해준다..
 *  
 */
package lec15;

import java.util.Map;
import java.util.TreeMap;

public class Test05 {
	public static void main(String[] args) {
//		Map<String, String> member = new HashMap<>();
		Map<String, String> member = new TreeMap<>();
		member.put("name", "홍길동");
		member.put("id", "hong");

		//{name=홍길동, id=hong}
		System.out.println(member);
		
		String id = member.get("id");
		System.out.println("id : " + id);
		
		// email 키가 없는 경우 null 이 반환
		String email = member.get("email");
		System.out.println("email : " + email);
		
		// 기존 값을 수정한다.
		String previd = member.put("id", "king");	// 이전값을 갖고있다.
		System.out.println("id : " + member.get("id"));  // king 출력
		System.out.println("previd : " + previd); 		// 이전값인 hong 출력
		
		String prevEmail = member.put("email", "aaa@a.com");
		System.out.println("prevEmail : " + prevEmail);		// 이전값이 없기 때문에 null
		
		System.out.println(member);
	}
}
