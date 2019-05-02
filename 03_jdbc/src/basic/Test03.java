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

public class Test03 {
	public static void main(String[] args) {
		try {
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
			sql.append("set title = 'jdbc 수정제목', ");
			sql.append("    content = 'jdbc 수정내용' ");
			sql.append("where no = 5");
			System.out.println(sql);
			
			// 4단계 : SQL 실행객체 얻기
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// 5단계 SQL 실행하기
			int cnt = pstmt.executeUpdate();
			// 결과처리.
			System.out.println(cnt + "개의 행이 수정되었습니다.");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	}
}
