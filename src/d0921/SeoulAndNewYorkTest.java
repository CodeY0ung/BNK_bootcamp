package d0921;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SeoulAndNewYorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//서울 시간을 뉴욕 시간으로 변경하기
		ZonedDateTime seoulTime =
				ZonedDateTime.of(
						2026, 9, 21, 11, 25, 59, 0,
						ZoneId.of("Asia/Seoul")
				);
		
		ZonedDateTime newYorkTime =
				seoulTime.withZoneSameInstant(
							ZoneId.of("America/New_York")
						);
		
		DateTimeFormatter dtf =
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z VV xxx");
		System.out.println("Seoul : " + seoulTime.format(dtf));
		System.out.println("New York : "+ newYorkTime.format(dtf));
	}

}
