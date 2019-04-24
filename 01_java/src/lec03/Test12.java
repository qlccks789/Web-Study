package lec03;

public class Test12 {
	public static void main(String[] args) {
		/*
		for (int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
			
			for (int j = 0; j < 2; j++) {
				if (j == 1) {
					break;
				}

				System.out.println("j = " + j);
			}
			
			System.out.println("j 반복 빠져나옴");
		}
		*/
		
		outer : 
		for (int i = 0; i < 3; i++) {
			System.out.println("i = " + i);
			
			for (int j = 0; j < 2; j++) {
				if (j == 1) {
					break outer;
				}
				
				System.out.println("j = " + j);
			}
			
			System.out.println("j 반복 빠져나옴");
		}
	
		System.out.println("i 반복 빠져나옴");
	}
}
