package d0908;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m1 = new Member(1,"철수", 21);
		Member m2 = new Member(3,"철수", 26);
		Member m3 = new Member(9,"맹구", 22);
		Member m4 = new Member(2,"훈이", 20);
		Member m5 = new Member(4,"훈이", 21);
		Member m6 = new Member(6,"훈이", 22);
		Member m7 = new Member(7,"훈이", 23);
		
		List<Member> mList = new ArrayList<>();
		mList.add(m1);
		mList.add(m2);
		mList.add(m3);
		mList.add(m4);
		mList.add(m5);
		mList.add(m6);
		mList.add(m7);
		
		for(Member m : mList) {
			System.out.println(m);
		}
		
		Collections.sort(mList);
		
		System.out.println("----------");
		
		for(Member m : mList) {
			System.out.println(m);
		}
	}
}
