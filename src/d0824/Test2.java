package d0824;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 태어난 월 입력 -> 탄생석을 알려준다.
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("태어난 월 입력 : ");
			int month = sc.nextInt();
			
			switch(month) {
			case 1:
				System.out.println("가넷");
				break;
			case 2:
				System.out.println("자수정");
				break;
			case 3:
				System.out.println("아쿠아마린");
				break;
			case 4:
				System.out.println("다이아몬드");
				break;
			case 5:
				System.out.println("에메랄드");
				break;
			case 6:
				System.out.println("진주");
				break;
			case 7:
				System.out.println("루비");
				break;
			case 8:
				System.out.println("페리도트");
				break;
			case 9:
				System.out.println("사파이어");
				break;
			case 10:
				System.out.println("오팔");
				break;
			case 11:
				System.out.println("토파즈");
				break;
			case 12:
				System.out.println("터키석");
				break;
			default:
				System.out.println("1 ~ 12 입력 가능");
			}
		}
		

	}

}
