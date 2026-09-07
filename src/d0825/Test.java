package d0825;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 가위바위보 프로그램
		// 반복문, switch, if, 함수내에서 함수 호출
		
		start();
		
	}
	
	// 반복 실행 함수
	static void start() {
		while(true) {
			String me = inputMe();
			String com = randomCom();
			if (me.equals("그만")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			result(me,com);	
		}
		
	}
	
	// 가위, 바위, 보 입력 함수
	static String inputMe() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가위 바위 보 중에 입력 : ");
		
		String me = scanner.next();
		
		scanner.close();
		return me;
	}
	
	// 컴퓨터 랜덤 함수
	static String randomCom() {
		String[] coms = {"가위","바위","보"};
		
		Random random = new Random();
		int index = random.nextInt(coms.length);
		String com = coms[index];
		return com;
	}
	
	// 결과 함수
	static void result(String me, String com) {
		if(me.equals("가위")) {
			switch(com) {
			case "가위" -> System.out.println("me : "+me+"\ncom : "+com+"\n비겼습니다.");
			case "바위" -> System.out.println("me : "+me+"\ncom : "+com+"\n졌습니다.");
			case "보" -> System.out.println("me : "+me+"\ncom : "+com+"\n이겼습니다.");
			}
		}
		else if(me.equals("바위")) {
			switch(com) {
			case "가위" -> System.out.println("me : "+me+"\ncom : "+com+"\n이겼습니다.");
			case "바위" -> System.out.println("me : "+me+"\ncom : "+com+"\n비겼습니다.");
			case "보" -> System.out.println("me : "+me+"\ncom : "+com+"\n졌습니다.");
			}
		}
		else if(me.equals("보")) {
			switch(com) {
			case "가위" -> System.out.println("me : "+me+"\ncom : "+com+"\n졌습니다.");
			case "바위" -> System.out.println("me : "+me+"\ncom : "+com+"\n이겼습니다.");
			case "보" -> System.out.println("me : "+me+"\ncom : "+com+"\n비겼습니다.");
			}
		}
		
		else {
			System.out.println("가위, 바위, 보 중에서 하나 입력해주세요.");
		}
	}
	
	
}
