// Calendar
// 추상클래스

 

package lec13;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test02 {
	public static void main(String[] args) {
		//	Calendar c = new Calendar();  //Cannot instantiate the type Calendar  추상클래스이기때문에 객체 생성을 못함.
		// 직접 자식을 선택해서 생성
//	Calendar c = new GregorianCalendar();
		// Calendar.getInstance();
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		// 현재시간 정보 객체
		// 월은 0 ~ 11 까지 설정		: MONTH
		// 요일 1(일요일) ~ 7(토요일) : DAY_OF_WEEK
		System.out.println(c);
		
		// 값을 조회할 때 사용 : get(int field) -> field 값에 따라 넘겨주는게 달라진다.
		/*  // 가독성이 떨어진다..
		System.out.println(c.get(1));  		// 2109 (년도정보)
		System.out.println(c.get(2) + 1);   // 1 (월정보)
		System.out.println(c.get(3));  		// 4
		*/	// 누구나 알 수 있게 선언..
//		System.out.println(c.get(Calendar.YEAR));  		// 2109 (년도정보)
//		System.out.println(c.get(Calendar.MONTH) + 1);   // 1 (월정보)
//		System.out.println(c.get(3));  		// 4
		// 일
//		System.out.println(c.get(Calendar.DAY_OF_MONTH));
//		System.out.println(c.get(Calendar.DATE));
//		// 시
//		System.out.println(c.get(Calendar.HOUR));
//		// 분
//		System.out.println(c.get(Calendar.MINUTE));
//		// 초
//		System.out.println(c.get(Calendar.SECOND));
		// 요일
//		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		int dayWeek = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(dayWeek);
		// dayWeek : 월요일, 화요일, 수요일... 일요일
		// 여러가지 방법.. (조건은 안쓸수있으면 안쓰는게 좋다.)
		
//		String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
//		System.out.println(week[dayWeek] + "요일");

//		System.out.println(" 일월화수목금토".charAt(dayWeek) + "요일");
		/*
		switch (dayWeek) {
		case 0:
			System.out.println("일요일");
			break;
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
		}
		*/
		
		
	}
	
	
}
