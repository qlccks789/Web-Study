/**
 *  1.8 버전 부터 제공되는 java.time
 *  LocalDate
 *  LocalTime
 *  LocalDateTime
 */
package lec13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Test06 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();  // 현재 시간정보를 꺼내오는것.
		System.out.println(localDate);		// 2019-01-22
		
		// 추출하기
		int year = localDate.getYear();
		Month month = localDate.getMonth();
		int date = localDate.getDayOfMonth();
		DayOfWeek dow = localDate.getDayOfWeek();
		
		System.out.println("년 : " + year);
		System.out.println("월 : " + month.getValue());	// 월정보가 1~12 로 나온다.  Calendar 는 0~11로나온다
		System.out.println(month);  // JANUARY
		System.out.println(month.getDisplayName(TextStyle.FULL, Locale.KOREA));
		System.out.println(month.getDisplayName(TextStyle.FULL, Locale.JAPAN));
		System.out.println("일 : " + date);
		
		System.out.println(dow);
		// Calendar : 1(일) - 7(토)
		// LocalDate : 1(월) - 7(일)
		System.out.println(dow.getValue());
		System.out.println(
				dow.getDisplayName(TextStyle.FULL, Locale.KOREA)
				);
		System.out.println(
				dow.getDisplayName(TextStyle.SHORT, Locale.KOREA)
				);
		
		LocalDate ld = LocalDate.of(2019, 12, 25);
		System.out.println(ld);
		System.out.println(ld.get((ChronoField.YEAR)));
		System.out.println(ld.get((ChronoField.MONTH_OF_YEAR)));
		System.out.println(ld.get((ChronoField.DAY_OF_MONTH)));
				
//		ld = ld.plusDays(1);
		
		// 체인방식 기능...
		LocalDate changeLd = ld.plusDays(1);
		System.out.println(ld);
		System.out.println(changeLd);		
				
		ld = ld.plusYears(1);
		ld = ld.plusMonths(1);
		ld = ld.plusDays(1);
//		ld = ld.plusYears(1) .plusMonths(1) .plusDays(1);
		System.out.println(ld);
		
		ld =  ld.plus(1, ChronoUnit.YEARS)		
				.plus(1, ChronoUnit.MONTHS)
				.plus(1, ChronoUnit.DAYS);
		System.out.println(ld);
		
		// set 의 개념 : 설정하기
		ld = ld.withYear(2018)
			   .withMonth(10)
			   .withDayOfMonth(20);
		System.out.println(ld);
		
		ld = ld.with(ChronoField.YEAR, 2017)
				.with(ChronoField.MONTH_OF_YEAR, 11)
				.with(ChronoField.DAY_OF_MONTH, 11);
		System.out.println(ld);
			
	}
}
