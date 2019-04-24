package lec06;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("변수의 사용 범위");
		
		int i = 100;   // 변수 i 는 이 위치부터 사용 가능   // 이 위치보다 위에 있으면 i를 사용하지 못한다.
		
		// 변수의 사용 범위는 변수가 선언된 블럭({}) 단위로 사용 된다.
		String msg = "";
		if (i < 10) {
			 msg = "i가 10보다 작다.";
			System.out.println(msg);
		}
		System.out.println(msg);
		
		
		int k = 0;
		for (; k < 10 ; k++) {
			System.out.println(k);
		}
		System.out.println(k);
		
		
		String var1 = "";
		try {
			var1 = "";
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println(var1);
		}

	
	}
}
