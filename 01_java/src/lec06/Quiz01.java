package lec06;

public class Quiz01 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(20, 10);

		
		int result = 0;
		
		// 아래 값이 나오도록 출력하시오..
		result = c.cal("+",  10, 1);
		System.out.println(result);   //  11

		result = c.cal("-", 10, 1);
		System.out.println(result);   //  9
		
		result = c.cal("*", 10, 2);
		System.out.println(result);   //  20
		
		result = c.cal("/", 10, 2);
		System.out.println(result);   //  5
		
		
		
	}
}
