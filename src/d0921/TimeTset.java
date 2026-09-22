package d0921;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeTset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		String query = """
				SELECT current_time
				FROM server_time
				WHERE id = 1
				""";
		
		try (Connection conn = DriverManager.getConnection(url, user, password);
			 PreparedStatement pstmt = conn.prepareStatement(query);
			 ResultSet rs = pstmt.executeQuery()
		){
			if(rs.next()) {
				// java에서 Timestamp 형으로 받지말자.
//				Timestamp timestamp = rs.getTimestamp("current_time");
				// DB에서 시간대 정보를 포함해서 가져오자.
				OffsetDateTime timestamp = rs.getObject("current_time", OffsetDateTime.class);
				System.out.println("DB 시간 : " + timestamp);
				
				// 프로그램이 실행되고 있는 pc의 시간대
				ZoneId pcZone = ZoneId.systemDefault();
				
				//pc의 시간대로 변환(**** 핵심 ****)
				ZonedDateTime pcTime = 
						timestamp.atZoneSameInstant(pcZone);
				
				System.out.println("PC zone : " + pcZone);
				System.out.println("PC 시간대 : " + pcTime);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
