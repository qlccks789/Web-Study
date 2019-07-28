package kr.co.mlec.di._06setter;

public class Menu {
	
	private String desc;
	
	public Menu() {
		System.out.println("Menu() 생성자 호출");
	}
	
	public void setDesc(String desc) {
		System.out.println("setDesc(String desc) 메서드 호출");
		this.desc = desc;		
	}
	
	private Sand sand;
	
	public void setSand(Sand sand) {
		System.out.println("setSand(Sand sand) 메서드 호출");
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











