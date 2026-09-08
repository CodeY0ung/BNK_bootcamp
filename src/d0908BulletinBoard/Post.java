package d0908BulletinBoard;

public class Post {
	
	private static int cnt;
	private int pno;
	private String title;
	private String content;
	private String date;
	private String author;
	
	public Post(String title, String content, String date, String author) {
		cnt++;
		pno = cnt;
		this.title = title;
		this.content = content;
		this.date = date;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "게시글 번호 : "+pno+", 제목 : "+title+", "
				+ "내용 : "+content+", 작성날짜 : "+date+", 작성자 : "+author;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
