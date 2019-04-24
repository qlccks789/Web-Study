// alt + shift + s + r   : get set 단축키



/*
 * 	생성자의 특징 : this
 * 	this의 사용방식(3가지) - static 영역에서는 사용이 불가능.
 * 		: static이 선언되지 않은 메서드에서만 사용이 가능.
 * 	this : 현재 실행중인 객체
 * 	this.변수명
 * 	this.메서드명
 * 	this() -> 생성자 부른다.  
 * 	   제약사항 : 1.생성자 안에서만 호출 가능.
 * 			 2.생성자 안에서 첫번째 구문(문장)이 되어야 한다.
 */
package lec08;

public class Singer {
	private String name; 		// this 를 붙이면 <<-- 변수들을 가리킴..
	private int age;
	private String genre;
	
	public Singer() {
		// 기능이 동일할 경우 다른 생성자에 있는 것을 호출해서 사용하자.
//		this.name = "등록안됨";	
//		this.age = -1;
//		this.genre = "미정";
//		Singer("등록안됨", -1, "미정");
		this("등록안됨", -1, "미정");	// () 값들은 Singer 의 변수에 올 값들)
		// this 는 생성자 안에서 첫번째 구문(문장)이 되어야 한다..
	}
	public Singer(String name, int age, String genre) {
		this.name = name;		// this.변수명
		this.age = age;
		this.genre = genre;
	}
	
	
	public String getName() {
//		this("등록안됨", -1, "미정");  -> 에러 : 생성자 안에서만 호출이 가능하기 때문에..
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
}
