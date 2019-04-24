package lec14;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int CAPACITY = 10;
		int head = 0, tail = -1, size = 0;
		int[] queue = new int[CAPACITY];
		
		outer :
		while (true) {
			System.out.println("------------------");
			System.out.println("1. 입력");
			System.out.println("2. 꺼내기");
			System.out.println("3. 전체데이터 확인");
			System.out.println("0. 종료");
			System.out.println("------------------");
			System.out.print("메뉴 : ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				if (size == CAPACITY) {
					System.out.println("비어있는 공간이 없습니다.\n");
					break;
				}

				System.out.print("입력 값 : ");
				tail = (tail + 1) % CAPACITY;
				size++;
				queue[tail] = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				if (size == 0) {
					System.out.println("입력된 데이터가 없습니다.\n");
					break;
				}
				int val = queue[head];
				queue[head] = 0;
				System.out.println("꺼낸값 : " + val);
				head = (head + 1) % CAPACITY;
				size--;
				break;
			case 3:	
				System.out.println(Arrays.toString(queue));
				break;
			case 0:
				break outer;
			}
		}
	
	
	
	
	}
}
