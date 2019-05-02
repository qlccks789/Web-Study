/**
 *  Delete 작업 처리하기
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02 {
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
			
			// 3단계 : 실행할 SQL 작성하기
			StringBuilder sql = new StringBuilder();
			sql.append("delete "); // 뒤에 한칸 띄어쓰기하자.. (안하면 붙어서 수행을안함)
			sql.append("from tb_board ");
			sql.append("where no = 4");
			System.out.println(sql);
			
			// 4단계 : 작성된 SQL 실행할 객체를 얻기
			/** 
			 * Statement 상속관계
			 * 
			 *  	Statement
			 *  		|
			 *  	PreparedStatement(속도를 향상, 현재 사용되는 프레임워크 내부적으로 활용)
			 *  		|
			 *  	CallableStatement(PLSQL 작성된 것 호출시)
			 */
			// 객체를 얻어 올 때 실행할 SQL을 준비시킨다.
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			// 5단계 : SQL 실행하기
			/**
			 *	  	   (int)  executeUpdate() -> insert, delete, update
			 *	  (ResultSet) executeQuery() -> select
			 */
			
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 삭제 되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
