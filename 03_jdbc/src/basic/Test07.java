/**
 *  Delete 작업 처리하기
 */
package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test07 {
	public void deleteBoard(int no) throws Exception {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"hr", 
					"hr"
					);
			StringBuilder sql = new StringBuilder();
			sql.append("delete "); // 뒤에 한칸 띄어쓰기하자.. (안하면 붙어서 수행을안함)
			sql.append("  from tb_board ");
			sql.append(" where no = " + no);
			System.out.println(sql);
			
			PreparedStatement pstmt = con.prepareStatement(sql.toString());

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개의 행이 삭제 되었습니다.");
			
	}
	
	public void service() throws Exception{
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("삭제할 번호 : ");
			int no = Integer.parseInt(sc.nextLine());		
			if (no == -1) break;
			
			deleteBoard(no);
		}
	}
	
	public static void main(String[] args) {
		try {
			Test07 t07 = new Test07();
			t07.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
}
