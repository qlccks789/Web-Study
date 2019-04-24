/*
 * 	생성자의 특징 : this




 * 	this의 사용방식(3가지)
 * 	this : 현재 실행중인 객체
 * 	this.변수명
 * 	this.메서드명
 * 	this() -> 생성자 부른다.  
 * 	   제약사항 : 1.생성자 안에서만 호출 가능.
 * 			 2.생성자 안에서 첫번째 구문(문장)이 되어야 한다.
 */
package lec08;


public class Test04 {
	public static void main(String[] args) {
//		System.out.println(this);   -> 에러 : static 안에서 호출이 불가능..
		// 가수의 이름과 나이, 장르를 관리한다..
		// 트웰브, 24, R&B
		Singer s = new Singer();
		
		s.setName("트웰브");
		s.setAge(24);
		s.setGenre("R&B");
		
		Singer s2 = new Singer("트웰브", 24, "R&B");
		
		Singer s3 = new Singer();
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getGenre());
		s3.setName("미미");
		s3.setAge(22);
		// 장르는 아직 미정..
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getGenre());
	}
}
