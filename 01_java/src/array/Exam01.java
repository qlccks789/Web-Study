package array;

public class Exam01 {
public int getValue(int[] values, boolean isMax) {
	// 코드 완성
	int max = values[0];
	int min = values[0];
	
	for (int i = 0; i < values.length; i++) {
		if (max < values[i]) {
			max = values[i];
		} else if (min > values[i]) {
			min = values[i];
		}
	}
	if (isMax == true) {
		return max;
	} else {
		return min;
	}
}	
public static void main(String[] args) {
	
	Exam01 ex01 = new Exam01 ();
	// getValue 메소드를 호출하고 결과 학인
	int [] arr = {9, 2, 87, 12, 30};
	int max = ex01.getValue(arr, true);
	System.out.println("최대값 : " + max);
	
	int min = ex01.getValue(arr, false);
	System.out.println("최소값 : " + min);


	
	
 }
}
