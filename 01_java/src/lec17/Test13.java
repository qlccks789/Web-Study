package lec17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import lec.util.Timer;

public class Test13 {
	public static void main(String[] args) {
		System.out.println("복사 시작");
		try {
			FileInputStream fis = new FileInputStream("data/lec17/test.mp4");
			FileOutputStream fos = new FileOutputStream("data/lec17/test2.mp4");
			
			// 버퍼 활용하기
			byte[] buffer = new byte[1024 * 32];
			
			Timer t = new Timer();
			t.start();
			while (true) {
				int ch = fis.read(buffer);
				if (ch == -1) break;
				fos.write(buffer, 0, ch);
			}
			System.out.println("복사 시간 : " + t.end());
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}
}
