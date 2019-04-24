package lec17;

import java.io.BufferedReader;
import java.io.FileReader;

class MyClose implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("MyClose 클래스의 close 메서드 호출됨");
	}
	
}

public class Test20 {
	public static void main(String[] args) {
		try (	MyClose mc = new MyClose();
				FileReader fr =  new FileReader("data/lec17/Test03.java");
				BufferedReader br = new BufferedReader(fr);
				){
			System.out.println("코드 실행...");
			/*
			while (true) {
				int ch = fr.read();
				if (ch == -1) break;
				
				System.out.println((char) ch);
			}
			fr.close();
			*/
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("try 블럭 빠져나옴..");
	
	
	
	
	
	}
}
