package d0902;

import java.util.Scanner;

public class TryCatchTest {

	public static void main(String[] args) {
		int n = 0;
		
		try {
//			int a = 10/n;
			
//			int[] arr = {1,2,3}; 
//			arr[3] = 10;
			
//			A as = null;
//			as.f();
			
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없다.");
		}catch(ArrayIndexOutOfBoundsException oobe) {
			System.out.println("배열 범위를 초과했습니다.");
		}catch(NullPointerException ne) {
//			System.out.println(ne.getMessage());
			ne.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료.");	
		}
	}
}
