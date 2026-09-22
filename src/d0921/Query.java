package d0921;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import d0918.DBUtil;

public class Query {

	public static void reserve(Reservation reservation) {
		String query = "INSERT INTO fcfs VALUES(fcfs_pk_seq.NEXTVAL,?,?,?)";
		
		try (Connection conn = DBUtil.getConnection();
			
			PreparedStatement pstmt = conn.prepareStatement(query);){
			
			
			pstmt.setString(1, reservation.getName());
			pstmt.setObject(2, reservation.getReserve_at());
			pstmt.setObject(3, reservation.getReserve_at_with_zone());
			int result = pstmt.executeUpdate();
			System.out.println(result+"행 삽입 완료.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static void findAll() {
		String query = "select * from fcfs";
		
		try (Connection conn = DBUtil.getConnection();
			 PreparedStatement pstmt  = conn.prepareStatement(query);	
		){
			List<Reservation> rl = new ArrayList<>();
			
			try(ResultSet rs = pstmt.executeQuery()){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					
					 OffsetDateTime reserveAt =
				                rs.getObject("reserve_at", OffsetDateTime.class);

//				     ZonedDateTime reserveAt_with_zone =
//				                rs.getObject("reserve_at_with_zone", OffsetDateTime.class).atZoneSameInstant(ZoneId.systemDefault());

					 OffsetDateTime offset = 
							 	rs.getObject("reserve_at_with_zone", OffsetDateTime.class);
					 
				     ZonedDateTime zoned =
				                offset.atZoneSameInstant(ZoneId.systemDefault());
				     
				     rl.add(new Reservation(
				                id,
				                name,
				                reserveAt,
//				                reserveAt_with_zone
				                zoned
				        ));
				}	
			}catch (SQLException e ) {
				e.printStackTrace();
			}
			
			for(Reservation r : rl) {
				System.out.println(r);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
