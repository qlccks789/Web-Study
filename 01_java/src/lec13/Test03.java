package lec13;

import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {
		//설정
		Calendar c = Calendar.getInstance();   // Calendar 객체 생성하기   Calendar.getInstance(); 로 생성한다.
		
		System.out.println("변경 전");		// 2019 1 22
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println();
		
		// 현재년도, 현재월, 1일로 변경  ( 따로따로 하지않고 한번에 1로 변경)
		c.set(c.get(Calendar.YEAR), 	// 년도와
			  c.get(Calendar.MONTH), 	// 월을
			  1  );						// 1로 바꾸겠다.
		System.out.println("변경 후");		// 2019 1 1
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println();
		
		// 2018 년 12월 25일로 변경  (특정하게 하나씩 따로따로 바꿀 때 사용)
		c.set(Calendar.YEAR, 2018);		// Calendar.YEAR 부분을 2018년으로 바꾸겠다.
		c.set(Calendar.MONTH, 11);
		c.set(Calendar.DATE, 25);
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
	}
}
