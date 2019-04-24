package lec.util;

public class PrintUtil {
	
	/*
	public void print() {
		System.out.println("--------------------");
	}
		
	public void print(int count) {
		for (int i = 0 ; i < count; i++) {
			System.out.print("-");
		}
		System.out.println();		
	}
	
	public void print(int count, String ch) {
		for (int i = 0 ; i < count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	*/
	
	// ==
	
	public void print() {
		print(20, "-");
		
	}
	
	public void print(int count) {
		print(count, "-");		
	}
	
	public void print(int count, String ch) {
		for (int i = 0 ; i < count; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	
	
}
