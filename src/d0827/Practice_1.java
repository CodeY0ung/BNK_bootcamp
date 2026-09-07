package d0827;

import java.util.Random;
import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// 지뢰찾기... 지뢰를 찾으면 성공.
		
		// 지뢰 개수
		int count = 3;
		
		// 지도 생성 함수 10 * 10
		String[][] trapMap = createMap();
		
		// 지도에 지뢰 count개 생성 함수
		trapMap = createTrap(count,trapMap);
		
		// 선택한 인덱스의 값 확인 함수
		check(trapMap);
		
		// 출력
		printMap(trapMap);

	}
	
	// 지도 초기화 함수
	static String[][] createMap(){
		String[][] trapMap = new String[10][10];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				trapMap[i][j] = "0";
			}
		}
		return trapMap;
		
	}
	
	// 지뢰 생성 함수
	static String[][] createTrap(int count, String[][] trapMap){
		Random random = new Random();
		// 지뢰 count개
		for(int i =0; i < count; i++) {
			int position1 = random.nextInt(8)+1;
			int position2 = random.nextInt(8)+1;
			trapMap[position1][position2] = "지뢰";
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				
				// 안쪽 칸 먼저 처리
				if((i>0 && j>0) && (i<10 && j<10)) {
					
					// 지뢰 1칸 반경 근처 전부 1로 수정
					if(trapMap[i][j].equals("지뢰")) {
						trapMap[i-1][j] = "1";
						trapMap[i+1][j] = "1";
						trapMap[i][j-1] = "1";
						trapMap[i][j+1] = "1";
						trapMap[i-1][j-1] = "1";
						trapMap[i-1][j+1] = "1";
						trapMap[i+1][j-1] = "1";
						trapMap[i+1][j+1] = "1";
					}	
				}
			}
		}
		
		// 각 끝칸 처리
		
		for(int i = 0; i < 10; i++) {
			trapMap[i][0] = "-";
			trapMap[i][9] = "-";
			trapMap[0][i] = "-";
			trapMap[9][i] = "-";
		}
		
		return trapMap;
		
	}
	
	// 지도 출력 함수
	static void printMap(String[][] trapMap) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(trapMap[i][j]+"\t");	
			}
			System.out.println("");
		}
	}
	
	// 선택한 인덱스의 값 확인 함수
	static void check(String[][] trapMap) {
		Scanner scanner = new Scanner(System.in);
		
		// 지뢰가 확인될 때 까지 인덱스 입력해서 찾기?
		while(true) {
			System.out.println("확인할 위치의 행과 열을 입력하세요!!");
			System.out.println("2~9 입력 가능");
			System.out.print("행 : ");
			int i = scanner.nextInt() -1 ;
			System.out.print("열 : ");
			int j = scanner.nextInt() -1 ;
			
			if(trapMap[i][j].equals("지뢰")) {
				break;
			}
			
			System.out.println(trapMap[i][j]);
		}
		
		System.out.println("지뢰를 찾았습니다!");
		
	}
	

}
