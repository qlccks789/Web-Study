package kr.co.mlec.db.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.mlec.db.board.service.BoardService;
import kr.co.mlec.db.repository.vo.Board;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	public void tranTest() throws Exception {
		System.out.println("트랜잭션 테스트");
		Board board = new Board();
		board.setTitle("h");
		board.setContent("a");
		board.setWriter("m");
		service.updateBoard(board);
	}
	
	
	public void retrieveBoard() throws Exception {
		List<Board> list = service.retrieveBoard();
		System.out.println("게시물 정보 출력");
		System.out.println("---------------------------");
		for (Board board : list) {
			System.out.println(
					board.getNo() + "\t" + 
					board.getTitle() + "\t" + 
					board.getWriter() + "\t" + 
					board.getRegDate()
			);
		}
		
		
		
	}
}















