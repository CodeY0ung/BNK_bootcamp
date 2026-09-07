package d0828;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
//		String[] files = {
//				"[Java]aaa.txt",
//				"[Java]bbb.txt",
//				"[Java]ccc.pdf",
//				"[C]aaa.c",
//				"[C]bbb.c",
//				"[C]ccc.c",
//		};
//		
//
//		countExtender(files);
//		replaceExtender(files);
		
		String str = "0123456789";
		System.out.println(str);
		System.out.println(str.substring(2)); // 2~
		System.out.println(str.substring(6)); // 6~
		
		System.out.println(str.substring(2, 6)); // 2~5
		System.out.println(str.substring(6, 9)); // 6~8
		
		str = "ALSKDJFL";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		str = "  Hello Java  ";
		System.out.println(str);
		System.out.println(str.trim()); // 양 옆 공백 제거
		System.out.println(str.length());
		System.out.println(str.trim().length());
		
		String pw = " 1234";
		String pw2 = "1234";
		
		System.out.println(pw.equals(pw2));
		
		String a = "Hello";
		String b = "Java";
		
		System.out.println(a.concat(" ").concat(b)); // Hello Java
		System.out.println(a + " " + b);
		
		String c = " ";
		System.out.println(c.isEmpty()); // false
		String d = "";
		System.out.println(d.isEmpty()); // true
		
		System.out.println(c.isBlank()); // true
		System.out.println(d.isBlank()); // true
		
		// 사전 순으로 봤을 때 순서
		System.out.println("apple".compareTo("banana")); // -1
		System.out.println("banana".compareTo("apple")); // 1
		System.out.println("apple".compareTo("apple")); // 0
		
		//  형 변환 함수
		str = "123";
		int n = Integer.parseInt(str);
		System.out.println(n);
		
		str = "123.12";
		double dn = Double.parseDouble(str);
		System.out.println(str);
		
		str = "123";
		int m = 123;
		String x = String.valueOf(m);
		System.out.println(x.equals(str)); // true
		
		String name = "홍길동";
		int age = 25;
		
		// 문자열 포맷
		String result = "이름 : %s, 나이 : %d".formatted(name, age);
		System.out.println(result); // 이름: 홍길동, 나이 25
		
		result = String.format("이름 : %s, 나이 : %d",name, age);
		System.out.println(result); // 이름: 홍길동, 나이 25
		
		// 몇번째 인덱스에 있는지.. 없으면 -1 반환
		str = "Hello Java";
		System.out.println(str.indexOf("Java")); // 6
		
		str = "Java is easy. Java is fun.";
		System.out.println(str.indexOf(".")); // 12 
		System.out.println(str.lastIndexOf(".")); // 25
		
		String k = "[Java]aaa.txt";
		// 확장자 이름만 출력. lastIndexOf(), subString() 메소드를 사용하여
		int i = 0;
		i = k.lastIndexOf(".") + 1;
		System.out.println(k.substring(i));
	}
	
	static void countExtender(String[] files) {
		System.out.println("- 확장자별 file 수량 확인 프로그램 -");
		System.out.println("- 전체 파일 목록 -");
		for(String file : files) {
			System.out.println(file);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("확장자 입력 : ");
		String extender = scanner.nextLine();
		
		int cnt = 0;
		for(String file : files) {
			if(file.endsWith(extender)) {
				System.out.println(files[cnt]);
				cnt++;
			}
		}
		
		System.out.println(extender+"파일 : "+cnt+"개");
		
		scanner.close();
	}
	
	static void replaceExtender(String[] files) {
		Scanner scanner = new Scanner(System.in);
		
		String current;
		String after;
		
		System.out.println("- 파일 전체 목록 -");
		for(String file : files) {
			System.out.println(file);
		}
		
		System.out.print("변경할 파일 명 : ");
		current = scanner.nextLine();
		System.out.print("새로운 파일 명 : ");
		after = scanner.nextLine();
		
		for(String file : files) {
			if(file.equals(current)) {
				file.replace(current, after);
				System.out.println("변경 완료 되었습니다");
				System.out.println(file);
			}
		}
	}
	
	static void whereCharInString(char n) {
		String str = "Hellooooo";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='o') {
				System.out.println(n+" : "+i+"번 인덱스");
			}
		}
	}
	
	
	static void inputMoreThanFive() {
		boolean flag = false;
		System.out.print("5글자 이상 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String input_str  = sc.nextLine();
		
		while(!flag) {
			if(input_str.length()<5) {
				System.out.print("5글자 미만입니다 \n5글자 이상 입력하세요 : ");
				input_str = sc.nextLine();
			}
			else {
				System.out.println(input_str+" : "+input_str.length()+"글자");
				flag = true;
			}
		}
	}
}
