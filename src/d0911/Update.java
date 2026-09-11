package d0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void updateMemoByPhoneNum(String phoneNum, String memo) {
		
		System.out.println("----------- memo 수정 -----------");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url, user, password);
			if(conn==null) {
				System.out.println("DB 연결 실패...");
				return;
			}
			
			String query = "UPDATE phoneNumManager SET memo = ? WHERE phoneNum = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, memo);
			pstmt.setString(2, phoneNum);
			
			int result = pstmt.executeUpdate();
			
			if(result == 0) {
				System.out.println("memo UPDATE 실패");
			}
			else {
				System.out.println("memo UPDATE 성공");
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
