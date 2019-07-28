/**
 *  호출하는 서버 페이지를 POST 방식으로 해야 한다..
 *  
 *  URL클래스는 POST 방식의 호출이나 헤더의 정보를 활용하지 못한다.
 *  
 *  위의 방식들을 해결하기 위해서 HttpURLConnection 클래스를 활용한다.
 */
package net02.url;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test05 {
	public static void main(String[] args) {
		try {
			URL url = new URL(
				"http://203.236.209.130:8000/07_javawebserver/test/login2"	
			);
			
			// 사용하는 이유 : POST 방식의 호출 가능, 헤더값의 사용 가능
			HttpURLConnection conn = 
					(HttpURLConnection)url.openConnection();
			
			// 요청방식을 POST로 지정
			conn.setRequestMethod("POST");
			
			// 헤더값을 사용하기(헤더키, 헤더값)
			// secret-key: aaaa
			// secret-author: bbbb
			conn.setRequestProperty("secret-key", "aaaa");
			conn.setRequestProperty("secret-author", "bbbb");
			
			// POST 방식의 경우 파라미터 설정하기
			// 1단계 : 출력할 수 있도록 설정
			conn.setDoOutput(true);
			// 2단계 : 출력객체 얻기
			OutputStream out = conn.getOutputStream();
			// 3단계 : 출력하기(파라미터)
			out.write("id=a&pass=b".getBytes("utf-8"));
			// 4단계 : 출력 객체 닫기
			out.close();
			
			// 호출 후 결과에 대한 처리하기
			int code = conn.getResponseCode();
			System.out.println("응답 코드 : " + code);
			
			// 결과 확인
			InputStream in = conn.getInputStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}












