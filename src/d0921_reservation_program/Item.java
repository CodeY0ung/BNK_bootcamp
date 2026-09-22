package d0921_reservation_program;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	private int id;
	private String name;

	public Item(String name) {
		this.name = name;
	}
}
