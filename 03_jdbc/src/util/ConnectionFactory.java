/**
 *  Connection 하는 역할을 하는 클래스 , 메서드 생성해서 필요할때마다 불러쓰기.
 *    (사용할때마다 하드코딩해야하기때문에 하나로묶어서 객체만 불러와서 사용할수있음)
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// Connection 기능을 하는 클래스 생성하기.  필요할때마다 불러쓰자 (편리함)
public class ConnectionFactory {
	public static Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", 
				"hr", 
				"hr"
				);
	}
	
	public static void close(PreparedStatement pstmt) {
		close(null, pstmt);
	}
		
	public static void close(Connection con, PreparedStatement pstmt) {
		try {
			if (pstmt != null) pstmt.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			if (con != null) con.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	


}
