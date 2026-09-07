package d0902;

public class MyDate {
	
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
		validateYear();
		validateMonth();
		validateDay();
	}
	
	
	private void validateYear() {
		if(year < 1) {
			System.out.println(year+"년...0 이상 입력 가능");
		}
		else {
			System.out.println(year+"년");	
		}
	}
	

	// 월 유효성 검사
	public void validateMonth() {
		if((month > 12)||(month < 1)) {
			System.out.println(month + "월...1 ~ 12 입력 가능");
		}
		else {
			System.out.println(month+"월");	
		}
	}
	
	public void validateDay() {
		if((day>31)||(day<1)) {
			System.out.println(day + "일은 잘못된 입력값입니다.");
		}
		if(month == 2) {
			if((year%4==0 && year%100!=0) || year%400==0) {
				if(day > 29) {
					System.out.println(day+"일...윤년은 29일 까지 존재합니다.");
				}else {
					System.out.println(day+"일");	
				}
			}
			else {
				if(day>28) {
					System.out.println(day+"일...평년은 28일 까지 존재합니다.");
				}
				else {
					System.out.println(day+"일");
				}
			}
			
		}
		if(month<8) {
			if(month%2==0) {
				if(day>30) {
					System.out.println(month+"월은 30일 까지 존재합니다.");
				}
			}else {
				System.out.println(day+"일");
			}
		}
		else {
			if(month%2!=0) {
				if(day>30) {
					System.out.println(month+"월은 30일 까지 존재합니다.");
				}
			}else {
				System.out.println(day+"일");	
			}
		}
		
		
	}
	
	public String get() {
		if(year==0||month==0||day==0) {
			return "잘못된 날짜가 입력되었습니다.";
		}
		return "저장된 날짜는"+year+"년"+month+"월"+day+"일 입니다.";
	}
}
