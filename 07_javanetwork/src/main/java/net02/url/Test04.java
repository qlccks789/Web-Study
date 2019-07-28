/**
 * 연결된 URL로 부터 데이터 읽어오기
 */
package net02.url;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

public class Test04 {
	public static void main(String[] args) {
		// https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%B0%94
		try {
			// 서버에 한글데이터를 전송하려면 인코딩 처리해서 전송해야 한다.
			// 자바 -> %EC%9E%90%EB%B0%94
			String query = "자바";
			String enQuery = URLEncoder.encode(query, "utf-8");
			System.out.println(enQuery);
			
			URL url = new URL("http://203.236.209.130:8000/07_javawebserver/test/login?id=" + enQuery + "&pass=bbb");
			InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
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



















