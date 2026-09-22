package d0922;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	
	private long id;
	private long user_id;
	private long item_id;
	private int quantity;

	public Order(long user_id, long item_id, int quantity) {
		this.user_id = user_id;
		this.item_id = item_id;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "[주문 id : "+id+"]"+" : [주문자 정보 : "+user_id+"]"+" [주문 상품 정보 : "+item_id+"번 상품 "+quantity+"개]";
	}
	
}
