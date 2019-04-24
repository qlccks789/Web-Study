package For;

public class For01 {
	public static void main(String[] args) {
		int oddNo = 0;	// 홀수합계
		int even = 0;	// 짝수합계
		int total = 0;	// 전체합계
		
		for (int i = 1; i <=100; i++) {
			if (i % 2 == 0) {
				even += i;
			} else if(i % 2 == 1) {
				oddNo += i;
			}
		}
		System.out.println("홀수 합계 : " + oddNo);
		System.out.println("짝수 합계 : " + even);
		System.out.println("전체 합계 : " + (oddNo+even));
	
	
	
	
	
	}
}
