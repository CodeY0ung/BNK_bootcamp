package d0910;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectTest {

	public static void main(String[] args) {

		//DB 접속
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String user = "lwy";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			Connection conn = DriverManager.getConnection(url,user,password);
			if(conn == null) {
				System.out.println("DB 접속 실패");
				return;
			}
			
			System.out.println("DB 접속 성공....");
			
			//쿼리문 객체 생성 
			//접속 후에만 쿼리를 쓸 수 있게 접속객체를 통한 statement 타입의 변수 선언
			Statement stmt = conn.createStatement();
			
			//쿼리문 준비
			String query = "SELECT * FROM test02";
			
			//쿼리 실행
			// ResultSet은 Select에서만 사용
			ResultSet rs = stmt.executeQuery(query);
			List<Person> pl = new ArrayList<>();
			
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				
				pl.add(new Person(no,name,age));
				
				
				
				
				System.out.println(no + ", "+name+", "+age);
			}
			
			System.out.println("------- personList -------");
			for(Person p : pl) {
				System.out.println(p);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
