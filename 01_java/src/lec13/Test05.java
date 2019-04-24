// format / parse

package lec13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test05 {
	public static void main(String[] args) {
		// java.text.SimpleDateFormat 클래스 이해하기 
		// 역할 : 1. 날짜 -> 문자열 뽑기
		//    : 2. 문자열의 정보를 -> 날짜로 변경
		
		Date d = new Date();
		int year = d.getYear() + 1900;
		int month = d.getMonth() + 1;
		int date = d.getDate();
//		2019-01-22 형태로 출력하고싶다.
		/*
		System.out.printf("%d-%02d-%02d%n", year, month, date);
		System.out.printf("%d-%02d-%02d%n", year, month, date);
		System.out.printf("%d-%02d-%02d%n", year, month, date);
		System.out.printf("%d-%02d-%02d%n", year, month, date);
		*/
		
		/*
			패턴문자
			
			y : 년도
			M : 월
			d : 일
			H : 24시간기준
			h : 12시간기준
			m : 분
			s : 초

			2001-11-11 11:22:33
			yyyy-MM-dd HH:mm:ss
			
			2001.11.11.
			yyyy.MM.dd.
			
			02:53
			hh:mm
		*/
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss"
//				"yyyy.MM.dd"
//				"HH:mm"
				);
		// 시간에서 문자열 정보 추출하기
		Date cDate = new Date();
		String dateTime = sdf.format(cDate);  // sdf에게 연결하고싶다.. cDate를.. .fomat
		System.out.println(dateTime);
		// ==
		System.out.println(sdf.format(new Date()));
		
		
		
		// 문자열에서 시간정보 변경하기
		// Date parse(String)
		sdf.applyPattern("yyyy-MM-dd");
		try {
			Date d2 = sdf.parse("2019-12-25");
			System.out.println(d2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
