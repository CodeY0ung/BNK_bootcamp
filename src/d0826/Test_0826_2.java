package d0826;

import java.util.Random;

public class Test_0826_2 {

	public static void main(String[] args) {
		
//		메인 함수 안에 어떤 배열에 임의의 값들이 들어가있음. 배열에 같은 수가 있는지 알고싶음. 다른 함수한테 시켰음.
		
		int[] a = new int[5];
		Random random = new Random();
		
		for(int i = 0; i < 5; i++) {
			a[i] = random.nextInt(50);
			System.out.print(a[i]+" ");
		}
		
		if(isDuplicated(a)) {
			System.out.println("중복 있음.");
			System.out.println("중복 횟수 : " + duplicatedTime(a));
		}
		
		else {
			System.out.println("중복 없음.");
		}
		

	}
	
	// 중복 여부
	static boolean isDuplicated(int[] a) {
		boolean is_dupli = false;
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					is_dupli = true;
				}
			}
		}
		return is_dupli;
		
	}
	
	// 중복 횟수
	static int duplicatedTime(int[] a) {
		int cnt = 0;
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < i; j++) {
				if(a[i] == a[j]) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
	
	// 중복 숫자들.. 반환값이 여러개일때.. set로 반환하면 될듯.
//	static int[] duplicatedNums(int[] a) {
//		// 세트 선언 필요.
//		// 세트 안의 각 원소들과 비교해서 횟수와 세트 값들 알아낼 수 있을 듯.
//		for(int i = 0; i < a.length; i++) {
//			
//			for(int j = 0; j < i; j++) {
//				if(a[i] == a[j]) {
//					nums[i] = 
//				}
//			}
//		}
//	}

}
