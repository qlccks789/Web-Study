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

public class Test02 {
	private static void test01() {
		try {
			URL url = new URL("https://www.naver.com");
			InputStream in = url.openStream();
			while (true) {
				int ch = in.read();
				if (ch == -1) break;
				
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void test02() {
		try {
			URL url = new URL("https://www.naver.com");
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
	// 파일에 저장하기
	private static void test03() {
		try {
			URL url = new URL("https://www.naver.com");
			InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader br = new BufferedReader(isr);
			
			FileWriter fw = new FileWriter("naver.html");
			BufferedWriter bw = new BufferedWriter(fw);
			
			while (true) {
				String line = br.readLine();
				if (line == null) break;
				
				bw.write(line);
				bw.newLine();
				System.out.println(line);
			}
			
			bw.close(); fw.close();
			br.close(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		test01();
//		test02();
		test03();
	}
}



















