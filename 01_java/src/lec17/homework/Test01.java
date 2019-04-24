/*
	특정 디렉토리 하위의 파일들의 정보를 아래와 같은 형식으로 출력하는 프로그램을 작성하시오

		
	data\lec17
	----------------------
	directory : aaa
	file : Test03.java(732byte)
	file : Test03Copy.java(1464byte)
	file : Test04.java(371byte)
	file : Test05.java(388byte)
	file : Test06.java(494byte)
	file : test10.txt(7byte)
	----------------------
 */

package lec17.homework;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		File f = new File("data/lec17");
		File[] file = f.listFiles();
		System.out.println(f.getPath());
		System.out.println("-------------------------------");
		
		for (int i = 0; i < file.length; i++) {
			if (file[i].isDirectory()) {
				System.out.println("directory : " + file[i].getName());
			} else if (file[i].isFile()) {
				System.out.printf("file : %s(%dbyte)%n" , file[i].getName(), file[i].length());
			}
			
		}
		System.out.println("------------------------------");
	}
}