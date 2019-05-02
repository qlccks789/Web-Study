/**
 * (게시판의 글번호조회)
 */

package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import board.vo.Board;

public class Test10{
	public Board selectBoard(int no) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"hr", 
				"hr"
				);
	
		StringBuilder sql = new StringBuilder();
		sql.append("select no, title, writer, content, view_cnt, reg_date");
		sql.append("  from tb_board ");
		sql.append(" where no = ? ");
		
		PreparedStatement pstmt = con.prepareStatement(sql.toString());
		
		pstmt.setInt(1, no);
		
		ResultSet rs = pstmt.executeQuery();
		
		if (rs.next()) {			
			Board board = new Board();
			board.setNo(rs.getInt("no"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setContent(rs.getString("content"));
			board.setViewCnt(rs.getInt("view_cnt"));
			board.setRegDate(rs.getTimestamp("reg_date"));
			// 년월일 시분초 정보까지 다 가져오고 싶다 -> rs.getTimestamp
			return board;
		} 
		
		return null;
		
	}
	
	public static void main(String[] args) {
		try {
			Test10 t10 = new Test10();
			Board board = t10.selectBoard(41);
			if (board == null) {
				System.out.println("해당 게시글이 존재하지 않습니다.");
				return;
			}
			
			System.out.println("번호 : " + board.getNo());
			System.out.println("제목 : " + board.getTitle());
			System.out.println("내용 : " + board.getContent());
			System.out.println("작성자 : " + board.getWriter());
			System.out.println("조회수 : " + board.getViewCnt());
			
			Date regDate = board.getRegDate();
			SimpleDateFormat sdf = new SimpleDateFormat(
					"yyyy-MM-dd hh:mm:ss"
					);
			System.out.println("작성일 : " + sdf.format(regDate));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
