package lec17;

import java.io.File;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		File f = new File("data/lec17/Test03.java");
	
		// byte 단위 크기 반환
		// 1k : 1024 byte
		// 1m : 1024k -> 1024 * 1024
		// 1g : 1024m -> 1024 * 1024 * 1024
		long len = f.length();
		System.out.println("length(byte) : " + len);
		
		// 참고용으로..
		f.canRead(); // 읽을 수 있냐
		f.canWrite(); // 쓸수 있냐
		f.canExecute(); //실행 할 수 있냐
		System.out.println(f.canRead() ? "읽을 수 있다" : "없다");
		System.out.println(f.canWrite() ? "쓸 수 있다" : "없다");
		System.out.println(f.canExecute() ? "실행 할 수 있다" : "없다");
		
		// 파일의 마지막 수정시간 알아보기.
		long time = f.lastModified();
		Date d = new Date(time);
		System.out.println(d);
		
		String name = f.getName();  // 파일이름
		String parent = f.getParent();  // 부모경로
		String path = f.getPath();  // 전체 경로
		System.out.println("name : " + name);		// name : Test03.java
		System.out.println("parent : " + parent);	// parent : data\lec17
		System.out.println("path : " + path);		// path : data\lec17\Test03.java
	}
}
