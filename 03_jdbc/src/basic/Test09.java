/**
 *  게시물 수정해보기
 *  수정할 내용 -->
 *  	번호 : 5
 *  	제목 : jdbc 수정제목
 *  	내용 : jdbc 수정 내용
 *  
 *  (게시판의 수정과 유사)
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import board.vo.Board;

public class Test09 {
	
	public void updateBoard(Board board) throws Exception {
		// 1단계 :
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 2단계 :
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"hr", 
				"hr"
				);
		
		// 3단계 :
		StringBuilder sql = new StringBuilder();
		sql.append("update tb_board ");
		sql.append("set title = ?, ");
		sql.append("    content = ? ");
		sql.append("where no = ? " );
		System.out.println(sql);
		
		// 4단계 : SQL 실행객체 얻기
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setInt(3, board.getNo());
		
		// 5단계 SQL 실행하기
		int cnt = pstmt.executeUpdate();
		// 결과처리.
		System.out.println(cnt + "개의 행이 수정되었습니다.");
		
	}
	
	public static void main(String[] args) {
		try {
			Board temp = new Board();
			temp.setTitle("제목 수정");
			temp.setContent("내용 수정");
			temp.setNo(41);
			Test09 t09 = new Test09();
			t09.updateBoard(temp);
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}
}
