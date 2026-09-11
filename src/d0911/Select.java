package d0911;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Select {
	

	public static void findAll() {
		System.out.println("----------- 연락처 -----------");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn==null) {
				System.out.println("DB 연결 실패...");
				return;
			}
			
			String query = "SELECT * FROM phoneNumManager ORDER BY phoneNum ASC";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			List<PhoneBook> pl = new ArrayList<>();
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				String phoneNum = rs.getString("phoneNum");
				String name = rs.getString("name");
				String memo = rs.getString("memo");
				
				pl.add(new PhoneBook(phoneNum,name,memo));
			}
			
			for(PhoneBook p : pl) {
				System.out.println(p);
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
	
	public static void findByPhoneNum(String phoneNum) {

		System.out.println("----------- 연락처 조회 -----------");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn==null) {
				System.out.println("DB 연결 실패...");
				return;
			}
			
			String query = "SELECT * FROM phoneNumManager WHERE phoneNum = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, phoneNum);
			
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
				
			String phoneNum1 = rs.getString("phoneNum");
			String name = rs.getString("name");
			String memo = rs.getString("memo");
				
			PhoneBook pb = new PhoneBook(phoneNum1,name,memo);
			
			
			System.out.println(pb);
			
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
	
	public static void findByIncludedName(String name) {

		System.out.println("----------- 이름이 포함된 연락처 조회 -----------");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn==null) {
				System.out.println("DB 연결 실패...");
				return;
			}
			
			String query = "SELECT * FROM phoneNumManager WHERE name LIKE ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, name);
			
			
			ResultSet rs = pstmt.executeQuery();
			List<PhoneBook> pl = new ArrayList<>();
			
			while(rs.next()) {
				String phoneNum = rs.getString("phoneNum");
				String name1 = rs.getString("name");
				String memo = rs.getString("memo");
					
				pl.add(new PhoneBook(phoneNum,name1,memo));
				
				
				
			}

			for(PhoneBook pb : pl) {
				System.out.println(pb);
			}
			
			pstmt.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
