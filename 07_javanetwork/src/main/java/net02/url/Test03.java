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

public class Test03 {
	private static void test01() {
		try {
			URL url = new URL("http://203.236.209.130:8000/07_javawebserver/hi.html");
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
	private static void test02() {
		// https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%B0%94
		try {
			URL url = new URL("http://203.236.209.130:8000/07_javawebserver/test/login?id=홍길동&pass=bbb");
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
	public static void main(String[] args) {
//		test01();
		test02();
	}
}



















