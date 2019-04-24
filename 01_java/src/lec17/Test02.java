package lec17;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		File f = new File("data/lec17");
		if (f.exists()) {
			if (f.isDirectory()) {	// 디렉토리인지 확인하는것
				System.out.println("디렉토리임..");
			}
			if (f.isFile()) {		// 파일인지 확인하는것
				System.out.println("파일 입니다..");
			}
		} else {
			System.out.println("존재하지 않는 경로임.");
		}
	}
}
