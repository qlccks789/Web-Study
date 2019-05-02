/**
 * 	select절 결과 가져오기
 *  (게시판의 전체조회와 유사하게)
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class Test05 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr"
					);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, writer, title, content, view_cnt, reg_date");
			sql.append("  from tb_board");
			sql.append(" order by no desc");
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String writer = rs.getString("writer");
				String title = rs.getString("title");
				String content = rs.getString("content");
				int viewCnt = rs.getInt("view_cnt");
				Date regDate = rs.getDate("reg_date");
				
				System.out.println(no);
				System.out.println(writer);
				System.out.println(title);
				System.out.println(content);
				System.out.println(viewCnt);
				System.out.println(regDate);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
