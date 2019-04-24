package lec11.quiz;

import lec.util.ArrayList;
import lec06.Board;


public class Quiz04 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		// add(Object data)		Object data = "가";
		//						String d = (String)data,get
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		System.out.println(list.size());
//		String data = Object;
		String data = (String)list.get(2);
		System.out.println(list.get(2));
		
		ArrayList boardList = new ArrayList();
		Board b = new Board();
		b.setNo(1);
		b.setTitle("aaa");
		// Object data = b;
		boardList.add(b);
		
		Board board = (Board)boardList.get(0);
		System.out.println(board.getNo());
		System.out.println(board.getTitle());

		/*
		Board b = new Board();
		b.setNo(1);
		b.setTitle("aaa");
		 */
	}
}
