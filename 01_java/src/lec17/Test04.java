package lec17;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
		// 삭제 기능 
		File f = new File("data/lec17/test03.txt");
		if (f.delete()) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
}
