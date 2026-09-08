package d0908BulletinBoard;

public class BulletinBoardTest {

	public static void main(String[] args) {
		MemberRepository mr = new MemberRepository();
		Member m1 = new Member("hi","hi","짱구","액션가면");
		Member m2 = new Member("hi1","hello1","철수","철수세미");
		Member m3 = new Member("hi2","hello2","맹구","짱돌");
		Member m4 = new Member("hi3","hello3","훈이","주먹밥");
		Manager m = new Manager("manager","manager","관리자","관리자");
		
		MemberService ms = new MemberService(mr);
		ms.signUp(m1);
		ms.signUp(m2);
		ms.signUp(m3);
		ms.signUp(m4);
		mr.create(m);
		
		PostRepository pr = new PostRepository();
		Post p1 = new Post("제목1","내용1","2026-06-08","액션가면");
		Post p2 = new Post("제목2","내용2","2026-07-08","액션가면");
		Post p3 = new Post("제목3","내용3","2026-08-08","액션가면");
		Post p4 = new Post("제목4","내용4","2026-09-08","액션가면");
		Post p5 = new Post("제목5","내용5","2026-09-08","주먹밥");
		
		pr.create(p1);
		pr.create(p2);
		pr.create(p3);
		pr.create(p4);
		pr.create(p5);
		
		BulletinBoardController bbc = new BulletinBoardController(ms, pr); 
		bbc.Start();

	}

}
