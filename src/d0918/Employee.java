package d0918;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Employee {

	private int empId;
	private String empNo;
	private String empName;
	private BigDecimal salary;
	private LocalDate birthDate;
	private LocalDateTime hireTime;
}
