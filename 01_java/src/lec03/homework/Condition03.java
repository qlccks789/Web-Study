package lec03.homework;

import java.util.Scanner;

public class Condition03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 수량을 입력하시오 : ");
		int cnt = Integer.parseInt(sc.nextLine());
		
		System.out.print("상품 가격을 입력하시오 : ");
		int price = Integer.parseInt(sc.nextLine());
		
		int totPrice = cnt * price;
		if (cnt >= 10 && price >= 50000) {
			totPrice *= 0.9;
		}
		
		System.out.printf("상품 총 가격은 %d 원 입니다.", totPrice);		
	}
}
