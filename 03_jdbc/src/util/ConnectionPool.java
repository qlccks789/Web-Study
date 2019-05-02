package util;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
	private static final int INIT_COUNT = 3;
	private static List<Connection> free = new ArrayList<>();
	private static List<Connection> used = new ArrayList<>();
	
	static {
		try {
			for (int i = 0; i < INIT_COUNT; i++) {
				free.add(ConnectionFactory.getConnection());
			}
		} catch (Exception e) {
			System.out.println("초기 Connection 생성시 에러 발생");
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws Exception {
		if (free.isEmpty()) {
			throw new Exception("사용할 수 있는 Connection이 없습니다.");
		}
		Connection con = free.remove(0);
		used.add(con);
		return con;
	}
	
	/**
	 * 사용자로부터 Connection 의 사용이 끝난 경우의 처리 
	 * Connection 을 사용하고나서  다시 사용할수있도록 반납해줘야하는 과정
	 */
	public static void releaseConnection(Connection con) {
		used.remove(con);
		free.add(con);
	}
	
	
	public static void main(String[] args) {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(2000);  // 2초마다 실행해라 
				Connection con = ConnectionPool.getConnection();
				System.out.println(
						(i + 1) + "번째 요청 : " + con
					);
				ConnectionPool.releaseConnection(con);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
