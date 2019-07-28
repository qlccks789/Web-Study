package net02.url;

import java.net.URL;

public class Test01 {
	public static void main(String[] args) throws Exception {
		/* URL */
		/*
		 *  URL의 구성 요소
		 *  - 프로토콜(protocol) : http
		 *  - 호스트(host) : www.naver.com
		 *  - 포트(port) : 80
		 *  - 패스(path) : /meber/join.do, 어떤 기능인지 구분
		 *  - 쿼리(query) : id=a&name=hong, 기능을 실행하기 위해 필요한 데이터
		 *  
		 *  
		 *  html
		 *  <form action="/meber/join.do" method="get">
		 *  	<input type="text" name="id" />
		 *  	<input type="text" name="name" />
		 *  	<input type="submit" value="가입" />
		 *  </form>
		 *  
		 *  or
		 *  
		 *  <a href="/meber/join.do?id=a&name=hong">가입</a>
		 *  
		 */
		URL url = new URL(
			"http://www.naver.com:80/meber/join.do?id=a&name=hong"
		);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getQuery());
	}
}










