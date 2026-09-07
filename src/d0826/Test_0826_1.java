package d0826;

import java.util.Random;

public class Test_0826_1 {

	public static void main(String[] args) {
		
//		로또 번호 추출기 (중복된 숫자가 없어야 함)
	//		랜덤수 추출
	//		수 중복 여부 확인
		// 2중 반복문 안에 J를 -1로 만들어서 0부터 다시 돌게끔 해야함. 그래야 그 전에 인덱스들의 값들도 검증됨.
	//		배열에 값 저장
	//		출력하기
		
		int[] lottos = new int[5];
		int rdNum;
		boolean flag = false;
		Random random = new Random();
		
		
		for(int i = 0; i < 5; i++) {
			
			rdNum = random.nextInt(5) + 1;
			
			if(i>0) {
				for(int j = 0; j < i; j++) {
					if(rdNum == lottos[j]) {
						i --;
						flag = true;
					}
				}
			}
			
			if(!flag) {
				lottos[i] = rdNum;
			}
			
			flag = false;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(lottos[i]);
		}

	}

}
