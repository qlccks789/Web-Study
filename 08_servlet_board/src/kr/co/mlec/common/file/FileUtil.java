package kr.co.mlec.common.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {
	public static String readFile(String fileName) throws IOException {
		File f = new File(fileName);
		System.out.println(f.getAbsolutePath());
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

	public static byte[] readByteFile(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		byte[] buffer = new byte[fis.available()];
		fis.read(buffer);
		fis.close();
		return buffer;
	}
}














