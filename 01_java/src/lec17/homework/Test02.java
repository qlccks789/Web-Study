

package lec17.homework;

import java.io.File;

public class Test02 {
	static int cnt = 1;
	public static void main(String[] args) {
		File f = new File("data1");
		String names[] = f.list();
		int pos = 0;
		System.out.println("data 폴더 하위의 구조");
		System.out.println("------------------------------");
		while(true) {
			if(pos == names.length) {
				break;
			}
			System.out.println(names[pos]);
			File file = new File("data1/" + names[pos++]);
			recursion(file);
		}
		System.out.println("------------------------------");
	}

	public static void recursion(File f) {
		if(f.isDirectory()) {
			String dir = f.getPath();
			String temp [] = f.list();
			for(String s : temp) {	
				File t = new File(dir +"/"+ s);
				cnt ++;
				
				for(int i = 0; i < cnt ; i++) {
					System.out.print("   ");					
				}
				System.out.println(t.getName());
				recursion(t);
				cnt = 1;
			}
		}
	}
}
