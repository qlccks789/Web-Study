package lec13;

import java.util.Calendar;

public class Quiz01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.printf("%d년 %d월%n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int val = c.getActualMaximum(Calendar.DAY_OF_MONTH);

		c.set(Calendar.DATE, 1);
		int dow = c.get(Calendar.DAY_OF_WEEK);
		
		for (int j = 1; j <3; j++) {
			System.out.print("\t");
			
		}
		
		for (int i = 1; i <= val; i++) {
			System.out.printf("%d\t", i);
			if (i % 7 == (8-dow)%7) {
				System.out.println();
			}
		}

	
	
	
	
	
	
	
	
	}
}
