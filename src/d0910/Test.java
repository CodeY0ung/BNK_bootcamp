package d0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn == null) {
				System.out.println("DB 접속 실패...");
			}
			
			System.out.println("DB에 접속되었습니다!");
			
			Statement stmt = conn.createStatement();
			int no = 1;
			String name = "짱구";
			int age = 5;
			
			String query = "INSERT INTO test02(no,name,age) "
					+ "VALUES("+no+", '"+name+"', "+age+")";
			
			int result = stmt.executeUpdate(query);
			
			if(result == 1) {
				System.out.println("1개 행 삽입 성공");
			}
			else if(result == 0) {
				System.out.println("삽입 실패");
			}
			else {
				System.out.println("다수의 행 삽입 성공");
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
