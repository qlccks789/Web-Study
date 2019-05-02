/**
 * 	데이터 입력하기
 *  ---------------------------
 *  번호는   시퀀스 이용
 *  글쓴이   프로그램
 *  제목	 JDBC 입력
 *  내용	 JDBC를 활용한 입력
 *  ---------------------------
 * 
 * 
 * (게시판의 글 등록과 유사)
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test04 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr"
					);
			
			StringBuilder sql = new StringBuilder();
			sql.append("insert into tb_board(no, writer, title, content)");
			sql.append("values(s_board_no.nextval, '프로그램', 'JDBC 입력~', 'JDBC를 활용한 입력~')");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 입력 완료");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
