package d0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn==null) {
				System.out.println("DB 접속 실패...");
				return;
			}
			
			System.out.println("DB 접속 성공!");
			
			Statement stmt = conn.createStatement();
			int no = 1;
			
			String query = "DELETE FROM test02 WHERE no = "+no;
			
			int result = stmt.executeUpdate(query);
			
			if(result==1) {
				System.out.println("1개 행 삭제 성공");
			}
			else if(result==0) {
				System.out.println("삭제 안됐음");
			}
			else {
				System.out.println("여러 행 삭제 됨");
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
