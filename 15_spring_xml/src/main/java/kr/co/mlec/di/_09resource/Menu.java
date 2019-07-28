package kr.co.mlec.di._09resource;

import javax.annotation.Resource;

public class Menu {
	
//	@Qualifier("ch")
	@Resource(name="ham")
	private Sand sand;
	
	/*
	@Resource  // 생성자에 사용이 불가능하다.
	public Menu(Sand sand) {
		System.out.println("Menu(Sand sand)");
		this.sand = sand;
	}
	*/

	/*
	@Resource(name="ham")
	public void setSand(Sand sand) {
		System.out.println("setSand(Sand sand)");
		this.sand = sand;
	}
	 */
	
	public void print() {
		if (sand == null) {
			System.out.println("sand 객체 주입 실패");
			return ;
		}
		sand.info();
	}
	
}











