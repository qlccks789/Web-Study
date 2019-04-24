// 세터와 게터 자동으로 만들기 (매크로)

// Alt + Shift + s + r  

package lec06;

public class Test05 {
	public static void main(String[] args) {
		Board b = new Board();
//		b.title = "게시물 제목";
//		System.out.println(b.title);
		
		// getter 와 setter    -> private(접근제한)을 접근할 수 있도록 해주는 것.
		// 멤버변수 (필드)에 대한 직접 접근을 제한하기 때문에
		// 필드에 대한 변경이나 참조하려고 할 때 사용하는 방식
		b.setTitle("게시물 제목");	// 세터
		System.out.println(b.getTitle());
		
//		b.no = -11;
//		System.out.println("번호 : " + b.no());
		b.setNo(-11);
		System.out.println("번호 : " + b.getNo());
		
	}
}
