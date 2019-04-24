package lec06;

public class Board {
	
	private String title;
	private int no;
	
	public void setTitle(String t) {
		title = t;
	}

	public String getTitle() {
		return title;
	}

	
	public void setNo(int n) {
		if (n <= 0) {
			System.out.println("잘못된 번호 입니다.");
			return;
		}
		no = n;
	}

	public int getNo() {
		return no;
	}
	
	
	
	
	
	
}
