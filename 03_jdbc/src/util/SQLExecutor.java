package util;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class SQLExecutor {
	public static int update(String sql, Object...args) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionPool.getConnection();

			pstmt = con.prepareStatement(sql);
			// ? 가 있을 경우 값의 설정 처리
			// 인덱스 값을 동적으로 처리하도록 하자.. (항목을 늘거나 줄으면 계속 인덱스를 변경해야해서)
			int index = 1;
			// Object : 데이터타입을 모를 때 jdbc가 알아서 타입을 맞춰줌
			for (Object arg : args) {
				pstmt.setObject(index++, arg);
			}
			return pstmt.executeUpdate();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}

	}
}
