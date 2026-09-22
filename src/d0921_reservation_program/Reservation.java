package d0921_reservation_program;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
	private int id;
	private int user_id;
	private int item_id;
	private String reservation_status;
	private LocalDateTime reserve_at;
	private LocalDateTime confirm_at;
	
	public Reservation(int user_id, int item_id) {
		this.user_id = user_id;
		this.item_id = item_id;
	}
	
}
