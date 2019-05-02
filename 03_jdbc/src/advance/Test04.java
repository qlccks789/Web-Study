package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionFactory;

public class Test04 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionFactory.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close 작업을 ConnectionFactory에 넣어놓고 필요할때마다 꺼내온다.
			ConnectionFactory.close(con, pstmt);
			
			/*
			try {
				// 
				if (pstmt != null) pstmt.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {
				if (con != null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			*/
		}
		
	
	
	}
}
