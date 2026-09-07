package d0907;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class LdService {
	
	Map<String, String> dic;
	
	public LdService(Map<String, String> dic) {
		this.dic = dic;
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		Set<String> keySet = new HashSet<>();
		for(String key : dic.keySet()) {
			keySet.add(key);
		}
		List<String> keys = new ArrayList<>();
		for(String k : keySet) {
			keys.add(k);
		}
		
		Random random = new Random();
		int rdNum;
		String answer;
		
		int correct = 0;
		int total = 0;
		
		System.out.println("- 영단어 테스트 -");
		for(int i = 0 ; i<keys.size() ; i++) {
			rdNum = random.nextInt(10);
			System.out.print(keys.get(rdNum)+" : ");
			answer = sc.nextLine();
			if(answer.equals(dic.get(keys.get(rdNum)))) {
				System.out.println("정답입니다");
				correct ++;
			}else {
				System.out.println("오답입니다");
			}
		}
		total = correct * 10;
		System.out.println("정답 갯수 : "+correct);
		System.out.println("총점 : "+total);
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("- 메뉴 -");
		System.out.println("1번 : 문제풀기\n"
				+ "2번 : 종료");
		System.out.print("입력 : ");
		
		int n = sc.nextInt();
		
		switch(n) {
		case 1 -> test();
		case 2 -> System.out.println("시스템 종료");
		}
	}
	
}
