package lec04;

public class Test03 {
	public static void main(String[] args) {
		// 배열의 데이터를 원하는 값으로 설정(초기화)
		int [] iArr = new int[3];
		
		// 공간에 접근해서 값 설정.. : 배열의 이름[인덱스] = 값;
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		
		// 화면에 설정된 값을 출력한다.
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
	}
}







