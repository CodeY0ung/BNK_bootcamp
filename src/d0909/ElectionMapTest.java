package d0909;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectionMapTest {

	public static void main(String[] args) {
		
		String[] candidates = {
				"철수","짱구","맹구","훈이","유리"
		};
		
		List<String> ballotBox = new ArrayList<>();
		for(int i = 0; i<6;i++) {
			ballotBox.add("철수");	
		}
		for(int i = 0; i<7;i++) {
			ballotBox.add("짱구");	
		}
		for(int i = 0; i<5;i++) {
			ballotBox.add("맹구");	
		}
		for(int i = 0; i<6;i++) {
			ballotBox.add("훈이");	
		}
		for(int i = 0; i<6;i++) {
			ballotBox.add("유리");	
		}
		
		int aCnt = 0;
		int bCnt = 0;
		int cCnt = 0;
		int dCnt = 0;
		int eCnt = 0;
		int max = 0;
		String president = null;
		
		Map<String, Integer> map = new HashMap<>();
		for(String s : ballotBox) {
			if(s.equals("철수")) {
				map.put(s,++aCnt);
				if(max<aCnt) {
					max = aCnt;
					president = s;
				}
			}
			else if(s.equals("짱구")) {
				map.put(s,++bCnt);
				if(max<aCnt) {
					max = bCnt;
					president = s;
				}
			}
			else if(s.equals("맹구")) {
				map.put(s,++cCnt);
				if(max<aCnt) {
					max = cCnt;
					president = s;
				}
			}
			else if(s.equals("훈이")) {
				map.put(s,++dCnt);
				if(max<aCnt) {
					max = dCnt;
					president = s;
				}
			}
			else if(s.equals("유리")) {
				map.put(s,++eCnt);
				if(max<aCnt) {
					max = eCnt;
					president = s;
				}
			}
			
		}
		
		System.out.println("---------- 득표수 ----------");
		for(String k : map.keySet()) {
			System.out.println(k+" : "+map.get(k)+"표");
		}
		System.out.println("---------- 결과 ----------");
		System.out.println("반장 : "+president+"\t 득표수 : "+max+"표");
		
		
	}

}
