package lec17;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		File f = new File("data/lec17/test03.txt");
		if (f.exists()) {
			System.out.println("파일 존재함");
		} else {
			// 파일이 없으면 파일을 생성하기
			try {
				if(f.createNewFile()) {
					System.out.println("파일 생성됨");
				} else {
					System.out.println("파일 생성 실패");
				}
				
			} catch (Exception e){
				e.printStackTrace();
			}
		}

	
	
	}
}
