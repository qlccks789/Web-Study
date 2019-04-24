package lec15;

import java.util.Scanner;
import java.util.Stack;

class Browser{
	Scanner sc = new Scanner(System.in);
	Stack<String> stack = new Stack<>();
	String ad = sc.nextLine();
	String[] sArr = new String[5];
	
	
	public void movePage() {
		while(true) {
			System.out.print("호출할 페이지 주소 : ");
			ad = sc.nextLine();
			System.out.println("페이지 호출 : " + ad);
			System.out.println("현재 : " + ad);
			System.out.println("이전 : ");
			System.out.println("앞으로 : ");
		}
		
		
		
		
	}
	
	public void push() {
		stack.push(ad);
			

	}
	
	public void back() {
		stack.push(ad);
	}
	
	
	
}

public class Quiz02 {
	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.movePage();
	}
}
