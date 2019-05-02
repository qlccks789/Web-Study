package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test06 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr"
					);
			
			StringBuilder sql = new StringBuilder();
			sql.append("select no, title, writer ");
			sql.append("  from tb_board ");
			sql.append(" where no = 43 ");

			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			ResultSet rs = pstmt.executeQuery();
			
			if (rs.next()) {
				System.out.println("번호 : " + rs.getInt("no"));
				System.out.println("제목 : " + rs.getString("title"));
				System.out.println("작성자 : " + rs.getString("writer"));
			} else {
				System.out.println("없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
