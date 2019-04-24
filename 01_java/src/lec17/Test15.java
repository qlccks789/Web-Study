package lec17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Test15 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("data/lec17/Test03.java");
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter("data/lec17/Test031.java");
			BufferedWriter bw = new BufferedWriter(fw);  
			
			while (true) {
				String line = br.readLine();	
				if (line == null) break;
				
//				bw.write(line + "\r\n"); 		// 줄넘김을 해주는 작업..
				bw.write(line);					
				bw.newLine();					// 줄 넘김을 해주는 작업
			}
			System.out.println("파일 복사 작업 종료");
			bw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
			
	
	
	
	}
}
