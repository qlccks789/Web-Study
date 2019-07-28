package server;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class FileUtil {
	public static String readFile(String fileName) throws Exception {
		FileReader fr = new FileReader(fileName);
		BufferedReader br = new BufferedReader(fr);
		
		
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String line = br.readLine();
			if (line == null) break;
			
			sb.append(line);
		}
		
		br.close();  fr.close();
		
		return sb.toString();
	}

	public static byte[] readByteFile(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		byte[] buffer = new byte[fis.available()];
		fis.read(buffer);
		fis.close();
		return buffer;
	}
}














