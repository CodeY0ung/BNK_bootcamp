package d0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn == null) {
				System.out.println("DB접속 실패");
				return;
			}
			
			System.out.println("DB 접속 성공....");
			
			//쿼리문 객체 생성
			//접속 후에만 쿼리를 쓸 수 있게 접속객체를 통한 statement 타입의 변수 선언
			Statement stmt = conn.createStatement();
			
			int no = 4;
			String name = "Khan";
			int age = 40;
			
			// 쿼리문 준비
			String query = "INSERT INTO test02 (no,name,age)"
					+ "VALUES("+no+",'"+name+"',"+age+")";
			
			// 쿼리 실행
			int result = stmt.executeUpdate(query);
			
			if(result==1) {
				System.out.println("1개 행이 추가되었습니다.");
			}else {
				System.out.println("????????");
			}
			
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
