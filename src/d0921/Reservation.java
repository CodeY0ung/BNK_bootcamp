package d0921;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	private int id;
	private String name;
	private OffsetDateTime reserve_at;
	private ZonedDateTime reserve_at_with_zone;
	
	public Reservation(String name) {
		
		this.name = name;
		this.reserve_at = OffsetDateTime.now();
		this.reserve_at_with_zone = ZonedDateTime.now();
	}
	
}