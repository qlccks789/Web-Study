package array;

public class Exam02 {
	public static int findMedian(int[] values) {
		int sum = 0;
		int avg = 0;
		int[] arr = new int[values.length];
		
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		avg = sum / values.length;
		
		
		for (int i = 0; i < values.length; i++) {
			int val = values[i] - avg;
			if (val < 0) {
				val = -val;
			}
			arr[i] = val;
			
		}
		
		int min = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
				index = i;
			} else if (min == arr[i]) {
				min = values[index] > values[i] ? arr[i]-- : arr[i];
				index = i;
			}
		}
		return values[index];
		
	}
	
	
	
public static void main(String[] args) {
	// getValue 메소드를 호출하고 결과 학인
	int [] arr1 = {10, 4, 53, 63, 17, 37, 52, 16, 33, 65};
	int mid = findMedian(arr1);
	System.out.println("중간값 : " + mid);
	int [] arr2 = {32, 53, 52, 76, 15, 98, 76, 65, 36, 10};
	mid = findMedian(arr2);
	System.out.println("중간값 : " + mid);
	
	}

}
