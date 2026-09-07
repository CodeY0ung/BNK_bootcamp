package d0828;

// 패키지 다르면 import 해야함
import d0827.PigMoneyBox;

public class Test {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println(s1==s2);
		
		String s3 = new String("Hello");
		
		// 주소 비교
		System.out.println(s1==s3);
		
		// 내용 비교
		System.out.println(s1.equals(s3));
	
		XX xx = new XX();
		xx.toString();
		
	}
}
