// update 하기
package advance;

import java.sql.Connection;
import java.sql.PreparedStatement;

import util.ConnectionFactory;
import util.ConnectionPool;

public class Test06 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = ConnectionPool.getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("update tb_board ");
			sql.append("   set title = ?, ");
			sql.append("       content = ? ");
			sql.append(" where no = ? ");
			pstmt = con.prepareStatement(sql.toString());
			// ? 가 있을 경우 값의 설정 처리
			// 인덱스 값을 동적으로 처리하도록 하자.. (항목을 늘거나 줄으면 계속 인덱스를 변경해야해서)
			int index = 1;
			// Object : 데이터타입을 모를 때 jdbc가 알아서 타입을 맞춰줌
			pstmt.setObject(index++, "a");
			pstmt.setObject(index++, "b");
			pstmt.setObject(index++, 26);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 수정되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionFactory.close(pstmt);
			ConnectionPool.releaseConnection(con);
		}
	}
}