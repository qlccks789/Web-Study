/**
 
  JDBC
   - Java + SQL
   - java.sql.* , javax.sql.*
   - 대표적 클래스 
      : DriverManager (데이터베이스에 연결을 요청하고 연결정보를 객체로 반환하는 것)
      : Connection (데이터베이스의 연결된 객체)
      : Statement (작성된 SQL문을 실행할 수 있는 객체) 
      : ResultSet (SQL문이 select절 인 경우 결과를 표현하는 객체)
      
     .jar 자바가 인식할 수 있는 압출파일 ( .jar로 자료를 압축해서 배포해준다)
      
   - 프로젝트에서 JDBC를 사용하기 위한 준비
     : 벤더사(jdbc만든회사)에서 제공해주는 JDBC 드라이버를 인식하는 과정이 필요하다(라이브러리) 
     : 일반적으로 Driver 들은 jar 파일로 묶어서 배포됨..
     
   - 프로젝트에 jar 파일을 인식하는 단계(java project 일 경우)
     : oraclexe -> app -> oracle -> product -> 11.2.0 -> server -> jdbc -> lib -> ojdbc6.jar 복사하기
     : 이클립스에 jdbc 프로젝트 아래 lib 라는 폴더를 만들어준다.
     : 복사한 jar 파일을 프로젝트의 특정 폴더에 붙여넣기 한다. (lib)
  *주의할점* : 복사한 파일을 프로젝트가 자동 인식하지 않는다.
     : jar를 자바파일에서 사용하기 위해서는 빌드패스 설정을 해야한다.  
  *빌드패스 설정 * :1번방법 :jdbc 프로젝트 마우스 우클릭 -> 빌드패스 -> Configure Build Path -> 라이브러리 -> add jars -> ojdbc6.jar 선택해서 추가해주기.
              :2번방법 : 빌드패스하려는 파일(ojdbc6.jar 우클릭 -> 빌드패스 -> add to)
   
 */

package basic;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test01 {
	public static void main(String[] args) {
		try {
			// 1단계 : 드라이버 로딩 과정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩됨...");
			
			// 2단계 : 드라이브매니저를 이용한 연결 객체 얻기
			// Toad 생각하자..
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",  
					"hr", 
					"hr"
					);
			System.out.println("연결 : " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
