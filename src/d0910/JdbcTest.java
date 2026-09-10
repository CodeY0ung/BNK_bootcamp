package d0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			// 드라이브 로드 (Java 6 이상은 생략 가능하나 명시 가능)
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn != null) {
				System.out.println("오라클 19c 연결 성공!");
				conn.close();
			}
		}catch(ClassNotFoundException e) {
			System.out.println("OJDBC 드라이버를 찾을 수 없습니다: "+e.getMessage());
		}catch(SQLException e) {
			System.out.println("데이터베이스 연결 실패: "+e.getMessage());
		}
	}
}
