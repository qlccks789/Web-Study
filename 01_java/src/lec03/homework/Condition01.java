package lec03.homework;

import java.util.Scanner;

public class Condition01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("물건값을 입력하세요(만원) : ");
		int price   = sc.nextInt();
		// 할인율
		double disRate = 1.00;
		if     (price <= 10) disRate -= 0.03;
		else if(price <= 20) disRate -= 0.05;
		else if(price <= 30) disRate -= 0.08;
		else if(price > 100) disRate -= 0.10;
		
		System.out.printf("할인된 금액은 %.0f 원 입니다.", price * 10000 * disRate);		
	}
}
