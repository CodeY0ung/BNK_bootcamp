package d0903;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		
		// 1번 인덱스에 넣고, 뒤에 인덱스들이 뒤로 한 칸씩 다 밀림
		list.add(1, "가가가");
		
		String s = list.get(2);
		System.out.println(s);
		
		// 수정
		// 없는 인덱스 시도 시 예외 발생
		list.set(2, "hello");
		System.out.println(list.get(2));
		
		// 2번 인덱스 지우고, 나머지가 한 칸씩 앞으로 당겨짐
		// 없는 인덱스 삭제 시도 시 예외 발생
		String returnValue = list.remove(2);
		System.out.println("remove_returnValue : "+returnValue);
		System.out.println(list.get(2));
		
		// 값도 가능
		// 없는 값 삭제 시도 시 false 반환
		boolean tf = list.remove("zzz");
		System.out.println("remove_value tf: " + tf);
		System.out.println(list.get(2));
		
		// boolean값 반환.. 조건문에 사용 가능
		boolean tf1 = list.contains("yyy");
		if(tf1) {
			System.out.println("문의 하신 문자열이 존재합니다.");
		}
		else {
			System.out.println("문의 하신 문자열이 존재합니다.");
		}
		
		// 값의 인덱스 반환
		// 값이 없으면 -1 반환
		// 값이 없으면 없다고 말하도록 고치자.
		String searchValue = "ddd";
		int idx = list.indexOf(searchValue);
		if(idx < 0) {
			System.out.println("찾으시는 문자열이 list에 없어요.");
		}
		else {
			System.out.println("찾으시는 "+searchValue+"는"
					+ " list의 "+idx+"번 인덱스 에 있어요.");	
		}
		
		// 데이터가 들어가 있는 갯수를 알려줌
		int length = list.size();
		System.out.println("list의 길이 : "+length);
		
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("A");
		// 찾는 값의 처음과 끝 인덱스는 알 수 있음
		// 처음, 끝 제외하고 나머지 인덱스들은 모름.
		System.out.println(list2.indexOf("A"));
		System.out.println(list2.lastIndexOf("A"));
		
		// 전부 삭제
//		list2.clear();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		for(String el : list2) {
			System.out.println(el);
		}
		
		System.out.println("-------------------------");
		
		list2.forEach(value -> System.out.println(value));
		
		list2.forEach(System.out::println);
		
	}

}
