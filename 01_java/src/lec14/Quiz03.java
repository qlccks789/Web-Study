package lec14;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int CAPACITY = 5;
		int[] sArr = new int[CAPACITY];
		int pos = 0;
		
		outer:
		while (true) {
			System.out.println("----------------");
			System.out.println("1.입력");
			System.out.println("2.꺼내기");
			System.out.println("3.전체데이터 확인");
			System.out.println("0.종료");
			System.out.println("----------------");
			System.out.print("메뉴 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
				case 1:
					if (pos == CAPACITY) {
						System.out.println("비어있는 공간이 없습니다.");
						break;
					}
					
					System.out.print("입력 값 : ");
					int num = Integer.parseInt(sc.nextLine());
					
					sArr[pos++] = num;
					break;
					
				case 2:
					if (pos == 0) {
						System.out.println("입력된 데이터가 없습니다. ");
						break;
					}
					
					System.out.println("꺼낸 값 : " + sArr[pos]);
					sArr[pos--] = 0;
					break;
					
				case 3:
					System.out.println(Arrays.toString(sArr));
					break;
				case 4:
					System.exit(0);
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
