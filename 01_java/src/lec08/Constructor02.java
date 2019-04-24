package lec08;

public class Constructor02 {
	Constructor02(){
		System.out.println("매개변수 없는 생성자");
	}
	Constructor02(String msg){
		System.out.println("매개변수 문자열 생성자");
	}
	Constructor02(int val){
		System.out.println("매개변수 정수 생성자");
	}
	
}
