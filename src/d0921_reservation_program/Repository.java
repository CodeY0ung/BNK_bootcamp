package d0921_reservation_program;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Repository {

	public void createMember(String name) {
		String query = "INSERT INTO member(id, name) VALUES(user_seq.NEXTVAL,?)";
		
		try (Connection conn = DBUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query);){
			
			pstmt.setString(1, name);
			
			int result = pstmt.executeUpdate();
			System.out.println(result+"개 user 생성 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createItem(String name) {
		String query = "INSERT INTO item(id, name) VALUES(item_seq.NEXTVAL,?)";
		
		try (Connection conn = DBUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query);){
			
			pstmt.setString(1, name);
			int result = pstmt.executeUpdate();
			System.out.println(result+"개 item 생성 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void requestReservation(int user_id, int item_id) {
		String query = "INSERT INTO reservation(id, member_id, item_id, reservation_status,"
				+ "reserve_at) VALUES(reservation_seq.NEXTVAL,?,?,'request',?)";
		
		try (Connection conn = DBUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query);){
			
			pstmt.setInt(1,user_id);
			pstmt.setInt(2, item_id);
			// pc 기준 현재 시간
			pstmt.setObject(3,ZonedDateTime.now(ZoneId.systemDefault()));
			int result = pstmt.executeUpdate();
			System.out.println(result+"개 예약 요청 완료");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
