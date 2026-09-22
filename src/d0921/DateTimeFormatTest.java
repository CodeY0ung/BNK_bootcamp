package d0921;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern(
							"yyyy-MM-ss HH:mm:ss"
						);
		
		LocalDateTime localTime = LocalDateTime.now();
		System.out.println(localTime);
		System.out.println(localTime.format(formatter));
		
		System.out.println("-----------------------");
		
		DateTimeFormatter formatterWithZone = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss VV xxx");
		
		//z : 시간대 이름
		//VV : ZoneId
		//xxx : UTC offset
		ZonedDateTime now = ZonedDateTime.now();
		System.out.println(now);
		System.out.println(now.format(formatterWithZone));
		
		System.out.println("-----------------------");
		
		ZonedDateTime dateTime = ZonedDateTime.of(
					2026, 9, 21,
					10, 30, 59,
					0,
					ZoneId.of("Asia/Seoul")
				);
		System.out.println(dateTime);
		
		System.out.println("--------------------------------");
		//LocalDateTime --> ZonedDateTime
		LocalDateTime localDateTime = LocalDateTime.of(2026, 9, 21, 11, 8);
		
		ZoneId zoneId = ZoneId.of("Asia/Seoul");
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
		System.out.println(zonedDateTime.format(formatterWithZone));
		// 문자열로 ZonedDateTime 만들기
		ZonedDateTime zdt = ZonedDateTime.parse(
					"2026-09-21T23:30:00+09:00[Asia/Seoul]"
				);
		System.out.println(zdt.format(formatterWithZone));
		System.out.println("--------------------------------");
		//시간 수정하기 (새로운 객체 생성)
		ZonedDateTime changed = 
				zdt.withHour(20)
					.withMinute(50)
					.withSecond(11)
					.withNano(0);
		System.out.println(changed.format(formatterWithZone));
	}
}
