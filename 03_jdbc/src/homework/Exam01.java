package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.ConnectionFactory;

public class Exam01 {
	public static void printEmployee(String cityName, int salary) throws SQLException {
		// 구현하시오.
		try {
			
			Connection con = ConnectionFactory.getConnection();
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			Connection con = DriverManager.getConnection(
//					"jdbc:oracle:thin:@localhost:1521:xe", 
//					"hr", 
//					"hr"
//					);
			StringBuilder sql = new StringBuilder();
			sql.append("select l.city, e.first_name, e.salary ");
			sql.append("  from employees e, departments d, locations l ");
			sql.append(" where e.department_id = d.department_id ");
			sql.append("   and d.location_id = l.location_id ");
			sql.append("   and l.city like '%");
			sql.append(cityName);
			sql.append("%' and "); 
			sql.append("e.salary >= ? ");
//			System.out.println(sql);
			PreparedStatement pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, salary);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getString("city")+ "\t");
				System.out.print(rs.getString("first_name") + "\t");
				System.out.println(rs.getInt("salary"));
			}
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	
	}
		
	
	public static void main(String[] args) throws SQLException {
		System.out.println("===================================");
		printEmployee("cisco" , 6000);
		System.out.println("===================================");
		printEmployee("attle" , 15000);
		System.out.println("====================================");
	}
}
