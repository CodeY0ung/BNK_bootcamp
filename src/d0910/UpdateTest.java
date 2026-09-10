package d0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {
	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn == null) {
				System.out.println("DB 접속 실패..");
				return;
			}
			
			Statement stmt = conn.createStatement();
			String name = "맹구";
			int no = 1;
			
			String query = "UPDATE test02 SET name = '"+name+"' WHERE no = "+no;
			
			int result = stmt.executeUpdate(query);
			if(result == 1) {
				System.out.println("update 완료");
			}else {
				System.out.println("????????");
			}
			
			stmt.close();
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
