package d0909AvengersMapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AvengersTest {

	public static void main(String[] args) {
		List<Hero> heroList = new ArrayList<>();
		heroList.add(Hero.create("캡틴"));
		heroList.add(Hero.create("헐크"));
		heroList.add(Hero.create("토르"));
		
		
		Map<Integer, Hero> hero = new HashMap<>();
		
		for(Hero h : heroList) {
			hero.put(h.getId(), h);
		}
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("------ 메뉴 ------");
			System.out.println("1 : 캡틴 출동\n"
					+ "2 : 헐크 출동\n"
					+ "3 : 토르 출동\n"
					+ "4 : 총 출동\n"
					+ "5 : 종료\n"
					+ "-----------------");
			System.out.print("번호 입력 : ");
			int key = sc.nextInt();
			switch(key) {
			case 1 -> System.out.println(hero.get(key).getSkill());
			case 2 -> System.out.println(hero.get(key).getSkill());
			case 3 -> System.out.println(hero.get(key).getSkill());
			case 4 -> {
				System.out.println("--- 총 출동 ! ---");
				for(Integer k : hero.keySet()) {
					System.out.println(hero.get(k).getSkill());
				}
			}
			case 5 -> {
				System.out.println("시스템을 종료합니다.");
				break;
			}
			}
			
		}

	}

}
