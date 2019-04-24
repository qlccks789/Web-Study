/**
 * 	날짜 관련 클래스 사용하기 API
 * 	java.util.Date
 * 	java.util.Calender
 * 	java.text.SimpleDateFormat
 * 
 * 	1.8 부터
 * 	java.time 패키지 추가
 */
package lec13;

import java.io.File;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		// 현재 시간에 대한 정보를 가져올 때 사용..
		Date d = new Date();
	    // Tue Jan 22 10:47:04 KST 2019
		System.out.println(d);  
		
		File f = new File("a.txt");
		long modTime = f.lastModified();
		Date aFileDate = new Date(modTime);
		System.out.println(aFileDate.getTime());
		System.out.println(aFileDate.getYear() + 1900);
		System.out.println("a.txt : " + aFileDate);
		
		
		// Thu Jan 01 09:00:01 KST 1970
		Date d2 = new Date(1000);  // () 에 숫자를 줬을 때 1970년 1월1일 9시로 시작됨..  
		System.out.println(d2);
		long time = d2.getTime();
		System.out.println("time : " + time);
		
		// motTime의 값으로 d2 객체의 시간정보 변경 
		d2.setTime(modTime);
		int year = d2.getYear() + 1900;
		System.out.println("년도 : " + year);
		
		
		
	}
	
}
