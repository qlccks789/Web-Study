package kr.co.mlec.db.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.mlec.db.board.controller.BoardController;

public class Test {
	public static void main(String[] args) {
		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
			
			BoardController controller = context.getBean(BoardController.class);
			// 전체 게시물 조회하기
			controller.retrieveBoard();
//			controller.tranTest();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









