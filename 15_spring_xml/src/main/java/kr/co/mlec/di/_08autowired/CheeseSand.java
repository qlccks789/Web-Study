package kr.co.mlec.di._08autowired;

public class CheeseSand implements Sand {
	public CheeseSand() {
		System.out.println("치즈 샌드위치 생성자 호출");
	}
	public void info() {
		System.out.println("치즈 샌드위치 입니다.");
	}
}
