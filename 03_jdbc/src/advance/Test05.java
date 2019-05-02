// ConnectionPool 클래스 활용해보기..

package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test05 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnectionPool.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close 작업을 ConnectionFactory에 넣어놓고 필요할때마다 꺼내온다.
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
			
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
