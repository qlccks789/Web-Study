package kr.co.mlec.di._09resource;

import javax.annotation.Resource;

public class Menu {
	
//	@Qualifier("ch")
	@Resource(name="ham")
	private Sand sand;
	
	public void print() {
		if (sand == null) {
			System.out.println("sand 객체 주입 실패");
			return ;
		}
		sand.info();
	}
	
}











