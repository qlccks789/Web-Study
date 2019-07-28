package kr.co.mlec.di._05constructor;

public class Menu {
	
	private String desc;
	
	public Menu() {
		System.out.println("Menu() 생성자 호출");
	}
	
	public Menu(String desc) {
		System.out.println("Menu(String desc) 생성자 호출");
		this.desc = desc;		
	}
	
	private Sand sand;
	
	public Menu(Sand sand) {
		System.out.println("Menu(Sand sand) 생성자 호출");
		this.sand = sand;
	}
	
	public void info() {
		System.out.println("desc : " + desc);
		if (sand != null) {
			sand.info();
		} else {
			System.out.println("sand 객체 null임");
		}
	}
	
}











