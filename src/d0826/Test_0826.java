package d0826;

import java.util.Random;
import java.util.Scanner;

public class Test_0826 {

	public static void main(String[] args) {
//		구구단.. 2단부터.. 세로, 가로 출력
		
//		1-2+3-4+5... 100까지
		
//		소수 구하는 함수
		
//		배열에 값 넣는 함수, 출력하는 함수
		
//		1 ~ 100까지 수 배열이 있음. 배열을 이용해서 문제를 내는거임. 5문제 나옴 (5*5도 가능)
//		메인 함수 안에 어떤 배열에 임의의 값들이 들어가있음. 배열에 같은 수가 있는지 알고싶음. 다른 함수한테 시켰음.
		
		int[] array = new int[100];
		
		Random random = new Random();
		Scanner scanner  = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			array[i] = i + 1;
		}
		
		
		for(int j = 0; j < 5; j++) {
			int rdIdx1 = random.nextInt(100) + 1;
			int rdIdx2 = random.nextInt(100) + 1;
			int modeNum = random.nextInt(4) + 1;
			
			int result = switch(modeNum) {
			case 1 -> {
				System.out.print(array[rdIdx1] + " + " + array[rdIdx2] + " = ");
				yield array[rdIdx1] + array[rdIdx2];
			}
			case 2 -> {
				System.out.print(array[rdIdx1] + " - " + array[rdIdx2] + " = ");
				yield array[rdIdx1] - array[rdIdx2];
			}
			case 3 -> {
				System.out.print(array[rdIdx1] + " * " + array[rdIdx2] + " = ");
				yield array[rdIdx1] * array[rdIdx2];
			}
			case 4 -> {
				System.out.print(array[rdIdx1] + " / " + array[rdIdx2] + " = ");
				yield array[rdIdx1] / array[rdIdx2];
			}
			default -> 1;
			};

			int answer = scanner.nextInt();
			
			if(result == answer) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("오답입니다.");
			}
			
		}
		
		
		
		
	}
	
}
