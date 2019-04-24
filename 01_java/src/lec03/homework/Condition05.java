package lec03.homework;

import java.util.Random;

public class Condition05 {
	public static void main (String [] args){
		Random ran = new Random();
		int jumsu = ran.nextInt(100) + 1;
		
		System.out.printf("%d점은 %s입니다.\n"
				          , jumsu
				          , jumsu >= 60 ? "합격" : "불합격");
	}
}
