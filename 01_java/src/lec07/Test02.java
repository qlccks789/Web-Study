package lec07;

public class Test02 {
	public static void main(String[] args) {
		String s1 = "a";
		System.out.println("문자열 시작");
		// 시간 측정
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			s1 += i;
		}
		long end = System.currentTimeMillis();
		double time = (end - start) / 1000d;
		System.out.println("String : " + time);
		
		
		
		
		// 동기화  처리되어 있다.
		StringBuffer sb = new StringBuffer("a");
		System.out.println("StringBuffer 시작");
		// 시간 측정
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			sb.append(i);   					// append : +
		}
		end = System.currentTimeMillis();
		time = (end - start) / 1000d;
		System.out.println("StringBuffer : " + time);
		
		
		
		// 동기화 되어 있지 않은
		StringBuilder sb2 = new StringBuilder("a");
		System.out.println("StringBuilder 시작");
		// 시간 측정
		start = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			sb2.append(i); 						  // append : +
		}
		end = System.currentTimeMillis();
		time = (end - start) / 1000d;
		System.out.println("StringBuilder : " + time);
	}
}
