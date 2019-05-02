/**
 * 데이터 입력하기
 * ------------------------
 * 번호는 시퀀스 이용
 * 글쓴이  프로그램
 * 제목     JDBC 입력
 * 내용     JDBC를 활용한 입력
 * ------------------------
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import board.vo.Board;

public class Test08 {
	public void insertBoard(Board board) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"hr", "hr"
		);
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tb_board( ");
		sql.append("	no, title, writer, content ");
		sql.append(") values ( ");
		sql.append("	s_board_no.nextval, ?, ?, ? ");
		sql.append(") ");
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		// ?의 사용은 테이블이나 컬럼에 사용할 수 없다.
		// 실행하기 전에 ? 자리에 들어가야 할 값을 설정한다.
		pstmt.setString(1, board.getTitle());  // ? 하나 처리함
		pstmt.setString(2, board.getWriter());  // ? 하나 처리함
		pstmt.setString(3, board.getContent());  // ? 하나 처리함
		
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개의 행이 입력되었습니다.");
	}
	/*
	public void insertBoard(Board board) throws Exception {
		String name = "aaa";
		String s = "1'" + name + "'1";
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"hr", "hr"
				);
		StringBuilder sql = new StringBuilder();
		sql.append("insert into tb_board( ");
		sql.append("	no, title, writer, content ");
		sql.append(") values ( ");
		sql.append("	s_board_no.nextval, '" + board.getTitle() + "', '" + board.getWriter() + "', '" + board.getContent() + "' ");
		sql.append(") ");
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		int cnt = pstmt.executeUpdate();
		System.out.println(cnt + "개의 행이 입력되었습니다.");
	}
	*/
	public static void main(String[] args) {
		try {
			Board board = new Board();
			board.setTitle("동적인 입력");
			board.setWriter("홍길동");
			board.setContent("동적인 입력 테스트 입니다.");
			Test08 t08 = new Test08();
			t08.insertBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
















