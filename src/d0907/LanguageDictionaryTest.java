package d0907;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LanguageDictionaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 한/영 사전을 만들자
		// 단어 등록하기
		// key : 한글
		// 단어장 만들듯이
		// 문제 풀기 메뉴 선택시, 등록된 단어들이 나온다. 맞추면 10점. 틀리면 0점.
		
		// map의 key값들 -> set -> arrayList
		LanguageDictionary ld = new LanguageDictionary();
		ld.setDic("사과", "apple");
		ld.setDic("바나나", "banana");
		ld.setDic("오렌지", "orange");
		ld.setDic("레몬", "lemon");
		ld.setDic("수박", "watermelon");
		ld.setDic("멜론", "melon");
		ld.setDic("딸기", "strawberry");
		ld.setDic("귤", "mandarin");
		ld.setDic("자두", "plum");
		ld.setDic("포도", "grape");
		
		LdService lds = new LdService(ld.getDic());
		
		lds.menu();
		
		
		

	}

}
