package lec17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import lec.util.Timer;

public class Test14 {
	public static void main(String[] args) {
		System.out.println("복사 시작");
		try {
			FileInputStream fis = new FileInputStream("data/lec17/test.mp4");
			FileOutputStream fos = new FileOutputStream("data/lec17/test3.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);		// 파일 복사 속도 향상 Buffer
			BufferedOutputStream bos = new BufferedOutputStream(fos);	
			
			Timer t = new Timer();
			t.start();
			
			// 버퍼 활용하기
			
			while (true) {
				int ch = bis.read();
				if (ch == -1) break;
				bos.write(ch);
			}
			System.out.println("복사 시간 : " + t.end());
			bos.close();
			bis.close();
			fos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}
}
