package d0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void add(String phoneNum, String name, String memo) {
		
		System.out.println("----------- 연락처 추가 -----------");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn==null) {
				System.out.println("DB 연결 실패 ..");
				return;
			}
			
			String query = "INSERT INTO phoneNumManager VALUES(?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, phoneNum);
			pstmt.setString(2, name);
			pstmt.setString(3, memo);
			
			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				System.out.println("등록 실패...");
			}else {
				System.out.println("연락처 등록 성공!");
			}
			
			pstmt.close();
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
