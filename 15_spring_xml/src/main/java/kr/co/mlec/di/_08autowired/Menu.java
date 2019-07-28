package kr.co.mlec.di._08autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Menu {
	
//	@Qualifier("ch")
	@Autowired
	private Sand ham;
	
	/*
	@Autowired
	public Menu(Sand sand) {
		System.out.println("Menu(Sand sand)");
		this.sand = sand;
	}

	@Autowired
	public void setSand(Sand sand) {
		System.out.println("setSand(Sand sand)");
		this.sand = sand;
	}
	*/
	
	public void print() {
		if (ham == null) {
			System.out.println("sand 객체 주입 실패");
			return ;
		}
		ham.info();
	}
	
}











