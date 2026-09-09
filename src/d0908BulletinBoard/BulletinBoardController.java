package d0908BulletinBoard;

import java.util.Scanner;

public class BulletinBoardController {
	
//	회원 list가 있어야 함.
//	게시글 list가 있어야함.
	
	MemberService ms;
	PostRepository pr;
	
	public BulletinBoardController(MemberService ms, PostRepository pr) {
		this.ms = ms;
		this.pr = pr;
	}


	public void Start() {
		Scanner sc = new Scanner(System.in);
		User user;
		boolean isUser = true;
		String mode;
		String id = null;
		String pw = null;
		String name;
		String nickName = null;
//		1. 게시판 글 전체 보여주기
		System.out.println("- 게시판 -");
		pr.findAll();
//		로그인 or 회원가입 or 비회원으로 조회
		while(true) {
			System.out.println("로그인 하시겠습니까? 예/아니오/회원가입");
			mode = sc.next();
			if(mode.equals("예")) {
				boolean tf = true;
				while(tf) {
					System.out.print("ID : ");
					id = sc.next();
					System.out.print("PW : ");
					pw = sc.next();
					user = ms.signIn(id,pw);
					if(user != null) {
						nickName = user.getNickName();
						tf = false;
					}	
				}
				break;
			}
			else if(mode.equals("회원가입")){
				boolean tf = true;
				while(tf) {
					System.out.println("- 회원가입 페이지 -");
					System.out.print("ID : ");
					id = sc.next();
					System.out.print("PW : ");
					pw = sc.next();
					System.out.print("name : ");
					name = sc.next();
					System.out.print("nick-name : ");
					nickName = sc.next();
					if(ms.signUp(new Member(id,pw,name,nickName))) {
						tf = false;
					}	
				}
				ms.signIn(id, pw);
				break;
			}
			else if(mode.equals("아니오")) {
				System.out.println("비회원은 게시글 조회만 가능합니다.");
				isUser = false;
				break;
			}
			else {
				System.out.println("잘못된 입력값입니다.");
			}	
		}
		
		// 비회원
		if(!isUser) {
			boolean tf = true;
			while(tf) {
				System.out.println("게시글을 조회 하시겠습니까?\n"
						+ "작성자명으로 검색 : 1\n"
						+ "전체 글 조회 : 2\n"
						+ "프로그램 종료 : 0");
				String modeN = sc.next();
				if(modeN.equals("1")) {
					System.out.print("작성자 명을 입력하세요 : ");
					String nname = sc.next();
					pr.findByAuthor(nname);	
				}
				else if(modeN.equals("2")) {
					System.out.println("- 전체 글 조회 -");
					pr.findAll();
				}	
				else if(modeN.equals("3")) {
					System.out.println("프로그램을 종료합니다.");
					tf = false;
				}
				else {
					System.out.println("잘못된 입력값 입니다.");
				}
			}
		}
		// 회원
		else {
			// 관리자
			if(ms.findById(id).getRank().equals("관리자")) {
				boolean tf = true;
				while(tf) {
					System.out.println("관리자 모드입니다. 게시글을 blind 처리 할 수 있습니다.");
					// 글 수정 
					System.out.println("게시글을 blind처리 : 1\n"
							+ "전체 회원 조회 : 2\n"
							+ "게시글 조회 : 3\n"
							+ "프로그램 종료 : 종료");
					String modeN = sc.next();
					if(modeN.equals("1")) {
						pr.findAll();
						System.out.print("수정할 게시글의 번호를 입력하세요 : ");
						int pno = sc.nextInt();
						pr.blindByPno(pno);
						pr.findAll();
					}
					else if(modeN.equals("2")) {
						ms.findAll();
						ms.findMemNum();
					}
					else if(modeN.equals("3")) {
						pr.findAll();
						pr.findPostNum();
					}
					else if(modeN.equals("종료")) {
						System.out.println("프로그램을 종료합니다.");
						tf = false;
					}
					else {
						System.out.println("잘못된 입력값 입니다.");
					}
				}
				
			}
			// 일반회원
			else {
				boolean tf = true;
				while(tf) {
					System.out.println("환영합니다 회원님.\n"
							+ "다음 중 하나를 입력해주세요\n"
							+ "나의 게시글 조회 : 1\n"
							+ "글 작성 : 2\n"
							+ "글 수정 : 3\n"
							+ "글 삭제 : 4\n"
							+ "종료 : 5");
					String modeN = sc.next();
					// 글 조회
					if(modeN.equals("1")) {
						System.out.println("전체 글 조회 : 1\n"
								+ "작성자명으로 글 조회 : 2\n"
								+ "종료 : 3");
						String n = sc.next();
						if(n.equals("1")) {
							pr.findAll();
						}
						else if(n.equals("2")) {
							System.out.print("작성자 명 입력 : ");
							String nname = sc.next();
							pr.findByAuthor(nname);
						}
						else if(n.equals("3")) {
							System.out.println("프로그램을 종료합니다.");
							break;
						}
						else {
							System.out.println("잘못된 입력값입니다.");
						}
					}
					// 글 작성
					else if(modeN.equals("2")) {
						System.out.print("제목 : ");
						String title = sc.next();
						System.out.print("내용 : ");
						String content = sc.next();
						System.out.print("날짜 : ");
						String date = sc.next();
						pr.create(new Post(title,content,date,nickName));
						pr.findAll();
					}
					// 내 글 수정
					else if(modeN.equals("3")) {
						pr.findByAuthor(nickName);
						System.out.println("수정할 글 번호를 입력하세요 : ");
						int pno = sc.nextInt();
						System.out.println("저장할 글 내용을 입력하세요 : ");
						String content = sc.next();
						pr.updateContentByPno(pno, content);
						pr.findAll();
					}
					// 글 삭제
					else if(modeN.equals("4")) {
						pr.findByAuthor(nickName);
						System.out.println("삭제할 게시글의 번호를 입력하세요 : ");
						int pno = sc.nextInt();
						pr.deleteByPno(pno);
						pr.findAll();
					}
					else if(modeN.equals("5")) {
						System.out.println("프로그램을 종료합니다.");
						tf = false;
					}
					else {
						System.out.println("잘못된 값입니다.");
					}
				}
			}	
		}
		sc.close();
	}

//	1. 전체 글 조회
//	2. 글 작성
//	3. 내가 쓴 글 조회
//	4. 글 수정
//	5. 글 삭제
//	
//	1. 관리자 로그인
//	2. 글 수정

	
}
