package d0922;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

	public static void findOrderList(int number) {	

		int cnt = 0; // 반복문 돌릴 때 마다 number 만큼 증가.
		int pageCnt = 0;
		// offset 값 바꿔주면서 반복
		while(true) {
			String query = """
					select * from order_record
					order by id asc
					offset ? rows
					fetch next ? rows only
					""";
			
			try (Connection conn = DBUtil.getConnection();
				 PreparedStatement pstmt = conn.prepareStatement(query);){
				
				pstmt.setInt(1, cnt);
				pstmt.setInt(2,number);
				
				List<Order> ol = new ArrayList<>();
				
				try(ResultSet rs = pstmt.executeQuery()){
					while(rs.next()) {
						long id = rs.getLong("id");
						long user_id = rs.getLong("user_id");
						long item_id = rs.getLong("item_id");
						int quantity = rs.getInt("quantity");
						ol.add(new Order(id,user_id,item_id,quantity));
					}
				}
				
				// ol에 저장된 값이 없으면 break
				if(ol.isEmpty()) {
					break;
				}
				
				System.out.println("\n----------------------------- " + ++pageCnt+"페이지 ---------------------------------\n");
				
				for(Order o : ol) {
					System.out.println(o);
				}
				
				// 마지막 페이지면 break
				if(ol.size() < number) {
					break;
				}
				
				cnt += number;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
