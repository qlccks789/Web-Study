package lec14;

import java.util.Arrays;
import java.util.Scanner;

import lec.util.Queue;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue queue = new Queue();
		
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
				if (queue.full()) {
					System.out.println("비어있는 공간이 없습니다.\n");
					break;
				}

				System.out.print("입력 값 : ");
				queue.insert(Integer.parseInt(sc.nextLine()));
				break;
			case 2:
				if (queue.empty()) {
					System.out.println("입력된 데이터가 없습니다.\n");
					break;
				}
				System.out.println("꺼낸값 : " + queue.remove());
				break;
			case 3:	
				System.out.println(queue);
				break;
			case 0:
				break outer;
			}
		}
	}
	
	
}
