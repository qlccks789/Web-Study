/**
 *  트랜잭션(transaction)
 *  	- tcl : commit, rollback, savepoint
 *  	- 논리적으로 DML 문장들을 묶는 단위
 *  	- 전부 다 처리되거나 또는 전부 다 처리되지 않아야 한다. (all or nothing)
 *   - commit 
 *   	: 데이터베이스에 완전하게 적용
 *   - rollback 
 *   	: 이전 커밋까지 되돌린다.
 *   - savepoint
 *   	: 중간에 저장을 하는 역할.. ex> savepoint a;  -> a까지 롤백할수있음.
 *   
 *   - DDL 명령어는 자동 커밋이 발생한다.
 *   - JDBC 프로그램은 기본 설정이 자동 커밋임.
 */

package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02 {
	public static void main(String[] args) {
		// 정상수행으로 했을 경우
		
		Connection con = null;  // 필드변수로 만들어줘야함
		try {
			// 계좌이체 진행.. 첫번째는 성공, 두번째는 실패하도록 만들기
			// 1. 트랜잭션 처리하지 않은 경우
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr"
					);
			
			// AutoCommit을 해제   : con.setAutoCommit(false);
			con.setAutoCommit(false);
			
			StringBuilder sql1 = new StringBuilder();
			sql1.append("update tb_account ");
			sql1.append("   set money = money + 30000 ");
			sql1.append(" where id = 'a' ");
			
			PreparedStatement pstmt1 = con.prepareStatement(sql1.toString());
			pstmt1.executeUpdate();
			
			System.out.println("a 사용자의 계좌 업데이트 성공");
			
			StringBuilder sql2 = new StringBuilder();
			sql2.append("update tb_account ");
//			sql2.append("   set money1 = money - 30000 ");
			sql2.append("   set money = money - 30000 ");
			sql2.append(" where id = 'b' ");
			
			PreparedStatement pstmt2 = con.prepareStatement(sql2.toString());
			pstmt2.executeUpdate();
			
			System.out.println("b 사용자의 계좌 업데이트 성공");
			
			// 정상수행 했을 경우 커밋 하라고 해줘야한다.
			con.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				con.rollback();   // rollback 자체에도 예외가 발생할 수 있어서 예외처리를 또 해줘야함.
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
