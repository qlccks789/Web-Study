package kr.co.mlec.aop._01basic;

public class Test {
	public static void main(String[] args) {
		Controller controller = new BoardController();
		controller.service();
		controller = new MemberController();
		controller.service();
	}
}
