// 디자인패턴 - singleton pattern
package lec08;

public class Quiz01Sub {
	private Quiz01Sub() {}
	public void msg() {
		System.out.println("성공");
	}
	
	// 위의 코드는 수정하지 않는다.
	// 아래에 코드를 추가 할 수 있다.
	// 단, 생성자는 더이상 추가하면 안된다.
		
//	public static Quiz01Sub quiz = new Quiz01Sub();
	private static Quiz01Sub quiz;
	
	public static Quiz01Sub getInstance() {
		if (quiz == null) {
			quiz = new Quiz01Sub();
			
		}
		return quiz;
	}
}
