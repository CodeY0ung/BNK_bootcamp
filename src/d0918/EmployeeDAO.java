package d0918;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

//data excess object.. db와 통신할 때 쓰는 클래스 ... repository와 같음.
// dao -> mybatis, repository -> jpa
public class EmployeeDAO {
	
	public void insert(Employee emp) {
		//0. 쿼리 준비(미완성 된 쿼리 : ? 사용)
		String query = "INSERT INTO employee"
				+ "(emp_id, emp_no, emp_name, salary, birth_date, hire_time) "
				+ "VALUES(?,?,?,?,?,?)";
		
		// 자원 반납 자동으로 되는 문법
		//1. DB 접속 : Connection 객체 생성
		try (Connection conn = DBUtil.getConnection();
			//2. 쿼리 실행
			 PreparedStatement pstmt = conn.prepareStatement(query);
			){
			
			// 2-1. 쿼리 완성 : ?를 데이터로 채우기
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmpName());
			pstmt.setBigDecimal(4, emp.getSalary());
			pstmt.setDate(5, Date.valueOf(emp.getBirthDate()));
			pstmt.setTimestamp(6, Timestamp.valueOf(emp.getHireTime()));
			
			// 2-2. 쿼리 실행
			int result = pstmt.executeUpdate();
			System.out.println(result+"행 등록 완료");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Employee findByEmpId(int empId) {
		// 0. 쿼리 준비(미완성된 쿼리 : ? 사용)
		String query = """
				Select * from employee
				where emp_id = ?
				""";
		
		try(Connection conn = DBUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(query);	
		){
			pstmt.setInt(1, empId);
			try(ResultSet rs = pstmt.executeQuery();){
				if(rs.next()) {
					// DB의 각각의 컬럼 값을 Employee 인스턴스의 필드에 대입한다.
					Employee emp = new Employee();
					
					emp.setEmpId(rs.getInt("emp_id"));
					emp.setEmpName(rs.getString("emp_name"));
					emp.setEmpNo(rs.getString("emp_no"));
					emp.setSalary(rs.getBigDecimal("salary"));
					// localDate 타입으로 변환해서 필드에 저장
					emp.setBirthDate(rs.getDate("birth_date").toLocalDate());
					// localDateTime 타입으로 변환해서 필드에 저장
					emp.setHireTime(rs.getTimestamp("hire_time").toLocalDateTime());
					
					// 필드가 채워진 Employee 인스턴스를 반환한다.
					return emp;
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	//update가 컬럼마다 다 따로 있어야하나?
	// 객체로 받으면 나머지가 null값인가?.. 필드값이 다 채워져있는 객체로 받으면 되지않나?
	public void update(int emp_id, Employee e) {
		Employee emp = findByEmpId(emp_id);
		
		if(emp_id<=0) {
			System.out.println("유효하지 않은 id값");
			return;
		}
		
		if(e.getEmpNo()!=null) {
			emp.setEmpNo(e.getEmpNo());
		}
		
		if(e.getEmpName()!=null) {
			emp.setEmpName(e.getEmpName());
		}
		
		if(e.getSalary()!=null){
			emp.setSalary(e.getSalary());
		}
		
		if(e.getBirthDate()!=null) {
			emp.setBirthDate(e.getBirthDate());
		}
		
		if(e.getHireTime()!=null) {
			emp.setHireTime(e.getHireTime());
		}
		
		String sql = """
				UPDATE Employee
				SET emp_no = ?, emp_name = ?, salary = ?, birth_date = ?, hire_time = ?
				WHERE emp_id = ? 
				""";
		
		try (Connection conn = DBUtil.getConnection();	
			 PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			pstmt.setInt(6, emp.getEmpId());
			pstmt.setString(1, emp.getEmpNo());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setBigDecimal(3, emp.getSalary());
			pstmt.setDate(4, Date.valueOf(emp.getBirthDate()));
			pstmt.setTimestamp(5, Timestamp.valueOf(emp.getHireTime()));
			
			int result = pstmt.executeUpdate();
			System.out.println(result+"행 update 완료");
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void deleteByEmpId(int emp_id) {
		String query = "delete from employee where emp_id = ?";
		
		
		try (Connection conn = DBUtil.getConnection();
			 PreparedStatement pstmt = conn.prepareStatement(query);	
		){
			pstmt.setInt(1, emp_id);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 행 삭제 완료");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
