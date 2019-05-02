/**
 *  Variable Argument
 *   : 값이 증가하거나 감소했을때 매개변수를 수정해줘야하는 것을 편리하게 만들자..
 */
package advance;

public class Test07 {
	/*
	private static void sum(int i, int j ) {
		System.out.println(i + j);
	}
	
	private static void sum(int i, int j, int k) {
		System.out.println(i + j + k);
	}
	private static void sum(int[] arr) {
		int result = 0;
		for (int val : arr) {
			result += val;
		}
		System.out.println(result);
	}
    */
	
	// ...  : Variable Argument 
	// int...arr : sum을 부를때 매개변수가 몇개오던 상관없이 쓸수있다.
	// 하지만 위치는 매개변수의 제일 마지막에 위치해야함.(앞이나 중간 X)
	private static void sum(int...arr) {
		int result = 0;
		for (int val : arr) {
			result += val;
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		sum(1, 10);
		sum(1, 10, 100);
		sum(1, 10, 100, 1000, 10000);
		sum(new int[] {1, 10});
		sum(new int[] {1, 10, 100});
	}
}
