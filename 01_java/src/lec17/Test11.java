package lec17;

import java.io.FileReader;
import java.io.FileWriter;

public class Test11 {
	public static void main(String[] args) {
		// data/lec17/Test03.java 파일의 내용을 읽어서
		// data/lec17/Test03Copy.java 파일에 복사하기
		try {
			FileReader fr = new FileReader("data/lec17/Test03.java");
			FileWriter fw = new FileWriter("data/lec17/Test03Copy.java");
			
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				fw.write(ch);
			}
			System.out.println("파일 복사 성공~!");
			
			fr.close();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
