package kr.co.mlec.aop._02basic;

public class Test {
	public static void main(String[] args) {
		Controller controller = new ProxyController(new BoardController());
		controller.service();
		controller = new ProxyController(new MemberController());
		controller.service();
	}
}   