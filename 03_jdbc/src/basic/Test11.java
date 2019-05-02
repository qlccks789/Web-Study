/**
 * 	select절 결과 가져오기
 *  (게시판의 전체조회와 유사하게)
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import board.vo.Board;

public class Test11 {
	public List<Board> selectBoard()  throws Exception {
		List<Board> list = new ArrayList<>();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"hr", 
				"hr"
				);
		
		StringBuilder sql = new StringBuilder();
		sql.append("select no, writer, title, content, view_cnt, reg_date ");
		sql.append("  from tb_board ");
		sql.append(" order by no desc" );
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		
		ResultSet rs = pstmt.executeQuery();
		
		while (rs.next()) {
			Board board = new Board();
			board.setNo(rs.getInt("no"));
			board.setWriter(rs.getString("writer"));
			board.setTitle(rs.getString("title"));
			board.setContent(rs.getString("content"));
			board.setViewCnt(rs.getInt("view_cnt"));
			board.setRegDate(rs.getTimestamp("reg_date"));
			list.add(board);
		}
		
		return list;
		
		
	}
	
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
