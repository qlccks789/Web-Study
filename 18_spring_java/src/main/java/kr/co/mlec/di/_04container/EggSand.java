package kr.co.mlec.di._04container;

public class EggSand implements Sand {
	public EggSand() {
		System.out.println("계란 샌드위치 생성자 호출");
	}
	
	public void init() {
		System.out.println("객체 생성 후 초기화 작업 진행 처리...(init)");
	}
	
	public void info() {
		System.out.println("계란 샌드위치 입니다.");
	}
	
	public void destroy() {
		System.out.println("객체를 메모리에서 정리하기전에 해야할 일을 정의");
	}
}











