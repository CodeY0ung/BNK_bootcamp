package d0921;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ZoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter formatter = 
				DateTimeFormatter.ofPattern(
						"yyyy-MM-dd HH:mm:ss VV"
						);
		
		for(String id : ZoneId.getAvailableZoneIds()) {
			ZoneId zoneId = ZoneId.of(id);
			
			ZonedDateTime time = ZonedDateTime.now(zoneId);
			System.out.println(time.format(formatter));
		}
		System.out.println("-----------------------------");
		
		List<String> zoneIds = new ArrayList<>(ZoneId.getAvailableZoneIds());
		
		Collections.sort(zoneIds);
		
		for(String zoneId2 : zoneIds) {
			System.out.println(zoneId2);
		}
	}
}
