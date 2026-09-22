package d0921;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 현재 타임스탬프 (UTC 기준)
		Instant nowUTC = Instant.now();
		System.out.println("UTC Instant : "+nowUTC);

		// UTC 시간대를 한국시간(KST, UTC(+9))로 변환
		ZonedDateTime kstTime = nowUTC.atZone(ZoneId.of("Asia/Seoul"));
		System.out.println("KST ZonedDateTime : "+kstTime);
		
		// KST 시간을 UTC로 변환
		ZonedDateTime toUtc = kstTime.withZoneSameInstant(ZoneId.of("UTC"));
		System.out.println("UTC time : "+ toUtc);
		
	}
}
