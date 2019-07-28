package kr.co.mlec.aop._03schema;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		try {
			
			AbstractApplicationContext context = new GenericXmlApplicationContext(
					"config/aop/03schema/test.xml"
			);
			// BoardController 타입으로 Proxy 객체를 얻기 위해서는
			// <aop:config proxy-target-class="true"> 설정해야 한다.
//			Controller controller = context.getBean("board", BoardController.class);
			Controller controller = context.getBean("board", BoardController.class);
			System.out.println(controller);
			controller.service();
			
			controller = context.getBean("member", Controller.class);
			controller.service();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}   











