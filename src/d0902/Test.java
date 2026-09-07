package d0902;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		List<String> li = new ArrayList<>();
		Map<Integer,String> st = new HashMap<>();
		
		st.put(1, "dd");
		st.put(2, "ss");
		st.put(3, "dd");
		
		st.get(1);
		st.remove(1);
		System.out.println(st.get(1));
		
		for(Map.Entry<Integer, String> entry : st.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		for(int key : st.keySet()) {
			System.out.println(key);
		}
		
		for(String value : st.values()) {
			System.out.println(value);
		}
		
	}

}
