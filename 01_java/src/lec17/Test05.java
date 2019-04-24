/*
 * 		File f = new File("");

 * 
 * 		f.exists()	// 파일이 존재하는지 확인
 * 		f.isDirectory()	// 파일이 디렉토리인지 확인
 * 		f.isFile()		//파일이 파일인지 확인
 * 		f.mkDir()		// 디렉토리 생성
 * 		f.mkDirs()		// 디렉토리 생성
 * 		f.createNewFile()	//파일생성
 * 		f.delete()		//삭제
 */
package lec17;

import java.io.File;
import java.io.FilenameFilter;

public class Test05 {
	public static void main(String[] args) {
		File f = new File("data");
		if (f.exists()) {
			if (f.isDirectory()) {
				String[] names = f.list();
				for (String name : names) {
					System.out.println(name);
				}
				
				File[] files = f.listFiles();
				for (File file : files) {
					System.out.println(file);
				}
				
				names = f.list(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
//						System.out.println("accept : " + name);
						return name.startsWith("lec");
					}		
				});
			/*  람다식 방식..
				names = f.list((File dir, String name) -> {
					return name.startsWith("lec");
				});
			*/ 
				
				
				System.out.println("-------------------------");
				for (String name : names) {
					System.out.println(name);
				}
				System.out.println("-------------------------");
				files = f.listFiles(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
//						System.out.println("accept : " + name);
						return name.startsWith("lec");
					}		
				});
				
				for (File file : files) {
					System.out.println(file);
				}
			}
		}
	
	

	}
}
