package d0917;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Query {
	
	String url = "jdbc:oracle:thin:@localhost:1521:testdb";
	String user = "lwy";
	String password = "1234";
	
	public void remit(int id1, int id2, int amount) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn == null) {
				System.out.println("db 연결 실패...");
			}
			
			conn.setAutoCommit(false);
			
			// 계좌 1 잔돈 조회
			String query = "SELECT balance FROM account WHERE id = ?";
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id1);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			int balance = rs.getInt("balance");
			
			// 계좌 1 잔돈 amount만큼 차감
			query = "UPDATE account SET balance = ? WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, balance - amount);
			pstmt.setInt(2, id1);
			pstmt.executeUpdate();
			
			// 계좌 2 잔돈 조회
			query = "SELECT balance FROM account WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id2);
			rs = pstmt.executeQuery();
			rs.next();
			balance = rs.getInt("balance");
			
			
			// 계좌 2 잔돈 amount만큼 증가
			query = "UPDATE account SET balance = ? WHERE id = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, balance + amount);
			pstmt.setInt(2, id2);
			pstmt.executeUpdate();
			
			// 여기서 commit
			conn.commit();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deposit(int id, int amount) {
		
		try {
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn == null) {
				System.out.println("DB 연결 실패...");
			}
			
			conn.setAutoCommit(false);
			// 계좌 조회
			String query = "SELECT balance from account where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			int balance = rs.getInt("balance");
			
			// 잔액 증가
			query = "UPDATE account SET balance = ? WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, balance + amount);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
			conn.commit();
			
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
public void withdraw(int id, int amount) {
		
		try {
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn == null) {
				System.out.println("DB 연결 실패...");
			}
			
			conn.setAutoCommit(false);
			// 계좌 조회
			String query = "SELECT balance from account where id = ?";
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, id);
			
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			
			int balance = rs.getInt("balance");
			
			// 잔액 증가
			query = "UPDATE account SET balance = ? WHERE id = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, balance - amount);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
			conn.commit();
			
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
