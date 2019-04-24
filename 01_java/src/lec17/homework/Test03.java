/*
data1.txt 파일내용

-------------------------
Wind Direction
Wind Speed
Temperature
Humidity
-------------------------

data2.txt 파일내용
-------------------------
WindDirection
wind Speed
temPerature
Humidity!
-------------------------
data1 과 data2 를 비교하는데,, 대소문자는 비교 x 오타나 띄어쓰기가 다르면 true, false 반환...
 */
package lec17.homework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void dataCheck(String file1, String file2) throws Exception {
		// Scanner 사용 가능합니다.
		File f = new File(file1);
		Scanner sc = new Scanner(f);
		List<String> list = new ArrayList();
		
		while (sc.hasNextLine()) {
			list.add(sc.nextLine());
		}
		
		int len = list.size();
		f = new File(file2);
		sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			list.add(sc.nextLine());
		}
		
		for (int i = 0; i < list.size()/2; i++) {
			if (list.get(i).equalsIgnoreCase(list.get(len + i))) {
				System.out.printf("Line%d : Equals%n", i+1);
			} else {
				System.out.printf("Line%d : Not Equals%n", i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			dataCheck("data/lec17/exam/data1.txt", "data/lec17/exam/data2.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}