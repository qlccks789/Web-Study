/**
 * 	Object 타입으로 선언시의 장점
 * 	
 * 	장점 :
 * 	- 어떤 타입이든지 받을 수 있다.
 * 	
 * 	단점 :
 * 	- Object로 받기 때문에 꺼내서 활용하기 위해서는 형변환 연산자를 이용해서 코드를 작성.
 * 	- 특정한 타입만 받도록 제한 할 수 없다.
 * 	    잘못된 타입이 들어가게 되면 실행시에 에러가 발생하게 된다.
 */
package lec14;

import lec.util.ArrayList;

public class Test02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add("장광남");
		list.add("만두좋아하는주인공");
		
		list.add(100);
		try {
		for (int i = 0; i < list.size(); i++) {
			String name = (String)list.get(i);
			System.out.println(name + " : " + name.length());
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
