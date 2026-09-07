package d0907;

import java.util.HashMap;
import java.util.Map;

public class LanguageDictionary {
	
	private Map<String, String> dic = new HashMap<>();
	
	public void setDic(String korean, String english) {
		dic.put(korean, english);
	}
	
	public Map<String, String> getDic(){
		return dic;
	}

}
