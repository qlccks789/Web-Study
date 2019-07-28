package kr.co.mlec.aop._02basic;

public class ProxyController implements Controller {
	// 핵심기능 클래스
	private Controller controller;
	
	public ProxyController(Controller controller) {
		this.controller = controller;
	}
	
	public void service() {
		
		try {
			
			controller.service();  // 핵심기능 코드
			
		} catch (Exception e) {
			System.out.println("------------------");
			System.out.println("실행 중 예외 발생");
			e.printStackTrace();
			System.out.println("------------------");
		}
		
	}
}








