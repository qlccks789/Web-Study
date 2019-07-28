package kr.co.mlec.db.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.co.mlec.db.board.controller.BoardController;

public class Test {
	public static void main(String[] args) {
		try {
			AbstractApplicationContext context = 
					new GenericXmlApplicationContext(
								"config/db/spring/servlet-context.xml"
			);
			
			BoardController controller = context.getBean(BoardController.class);
			// 전체 게시물 조회하기
//			controller.retrieveBoard();
			controller.tranTest();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









