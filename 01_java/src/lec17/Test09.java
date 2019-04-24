package lec17;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test09 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("data/lec17/Test03.java");
			// 한글 데이터 깨짐..
//			FileInputStream fr = new FileInputStream("data/lec17/Test03.java");
			while(true) {
				// -1 : 더 이상 읽을 게 없다..
				int ch = fr.read();
				if (ch == -1) break;
				
				System.out.print((char)ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
	}
}
