package d0907;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "aaa");
		map.put(2, "aaa");
		map.put(3, "aaa");
		map.put(4,"BBB");
		
		System.out.println(map.size());
		System.out.println(map.get(3));
		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("BBB"));
		
		map.put(2, "xxx");
		System.out.println(map.get(2));
		
		// key,value 다 일치해야 지워짐
		map.remove(1, "bbb");
		
		// 그 key 값 삭제
		map.remove(1);
		System.out.println(map.get(1));
		
		map.clear();
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		
		map.put(1, "AAA");
		map.put(2, null);
		map.put(3, "CCC");
		
		for(Integer key : map.keySet()) {
			System.out.println(key);
		}
		
		
		for(Integer key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
		for(String value : map.values()) {
			System.out.println(value);
		}
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" , "+entry.getValue());
			System.out.println(entry);
		}
		
	}

}
