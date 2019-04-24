package lec03;

import java.util.Random;

public class Test07 {
	public static void main(String[] args) {
		Random r = new Random();
		int month = r.nextInt(12) + 1;
//		switch (month) {
//		case 3:
//			System.out.println("봄입니다.");
//			break;
//		case 4:
//			System.out.println("봄입니다.");
//			break;
//		case 5:
//			System.out.println("봄입니다.");
//			break;
//		case 6:
//			System.out.println("여름입니다.");
//			break;
//		case 7:
//			System.out.println("여름입니다.");
//			break;
//		case 8:
//			System.out.println("여름입니다.");
//			break;
//		}
		/*
		switch (month) {
		case 3:	case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6:	case 7:	case 8:
			System.out.println("여름입니다.");
			System.out.println("여름입니다.");
			break;
		}
			 */
			
			
		String season;
		switch (month) {
		case 3:	case 4: case 5:
			season = "봄";
			break;
		case 6:	case 7:	case 8:
			season = "여름";
			break;
		default:
			season = "";
		}
		System.out.println("month : " + month);
		System.out.println(season + "입니다.");
		 
	}
}
