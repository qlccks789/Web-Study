package lec13;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int val = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(val); 	// 31
		// 2월로 변경
		c.set(Calendar.MONTH, 1);  // -> 2월로 변경
		// 해당 월의 마지막 날짜를 가져올 때 사용 getActualMaximum
		int val1 = c.getActualMaximum(Calendar.DAY_OF_MONTH);  // 필드에해당하는 최대값을 얻는다.
		System.out.println(val1);	// 28
		
		// 현재 날짜를 변경 : 상대적 변경
//		c.add(Calendar.MONTH, -4); // 4달 전으로 가라.
//		c.add(Calendar.MONTH, 4);  // 4달 후로 가라.
//		System.out.println(c.get(Calendar.MONTH) + 1);  // 6월
		
		// Date 와 Calendar 변경
		Date d = new Date();
		// Date의 시간 정보를 Calendar에 적용하기
		// Date가 갖고 있는 정보를 Calendar에 적용하겠다.
		c.setTime(d);
		c.setTimeInMillis(d.getTime());
		
		File f = new File("a.txt");
		long time = f.lastModified();
		c.setTimeInMillis(time);
		
		// Calendar가 갖고 있는 정보를 Date에 적용하겠다. 
		Date d2 = c.getTime();
		
	}
}
