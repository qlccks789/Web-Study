package kr.co.mlec.di._08autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Menu {
	
//	@Qualifier("ch")
	@Autowired
	private Sand ham;
	
	public void print() {
		if (ham == null) {
			System.out.println("sand 객체 주입 실패");
			return ;
		}
		ham.info();
	}
	
}











