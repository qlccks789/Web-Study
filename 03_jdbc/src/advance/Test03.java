/**
 *  ConnectionFactory 클래스 활용하기  (Connection 작업을 객체를 불러와서 편리하게)
 */
package advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import util.ConnectionFactory;

public class Test03 {
	public void deleteBoard(int no) throws Exception {
         // Connection 작업을 불러오기.. ConnectionFactory클래스에있는 getConnection 메서드를 불러오기
			Connection con = ConnectionFactory.getConnection();
		
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
			Test03 t07 = new Test03();
			t07.service();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	
	}
}
