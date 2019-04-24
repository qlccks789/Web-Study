package For;

public class For05 {
	public static void main(String[] args) {

		System.out.print(" : 1  2  3  4  5  6  7  8  9\n");
		System.out.println("-------------------------------");
		
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%d단 ", i);
			for (int j = 1; j <= 9; j++ ) {
				System.out.printf("%2d " , i * j);
				
				
			}
			System.out.println();
		}
	}
}
