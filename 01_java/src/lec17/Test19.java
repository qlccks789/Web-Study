package lec17;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test19 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr =  new FileReader("data/lec17/Test03.java");
			br = new BufferedReader(fr);
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				
				System.out.println((char) ch);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (Exception e1) {}
			try {
				br.close();
			} catch (Exception e1) {}
		}
	
	
	
	
	
	
	}
}
