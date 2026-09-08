package d0908BulletinBoard;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
	
	List<Post> pl = new ArrayList<>();
	
	//create
	public void create(Post p) {
		pl.add(p);
	}
	
	//read
	public Post findByPno(int pno) {
		for(Post p : pl) {
			if(p.getPno()==pno) {
				return p;
			}
		}
		return null;
	}
	
	public void findByAuthor(String author) {
		for(Post p : pl) {
			if(p.getAuthor().equals(author)) {
				System.out.println(p);
			}
		}
	}
	
	public void findAll() {
		for(Post p : pl) {
			System.out.println(p);
		}
	}
	
	public void findPostNum() {
		int cnt = 0;
		for(Post p : pl) {
			cnt++;
		}
		System.out.println("게시글 개수 : "+cnt);
	}
	
	//update
	public void updateContentByPno(int pno, String content) {
		for(Post p : pl) {
			if(p.getPno()==pno) {
				p.setContent(content);
			}
		}
	}
	
	//delete
	public void deleteByPno(int pno) {
		pl.remove(findByPno(pno));
	}
	
	//blind
	public void blindByPno(int pno) {
		updateContentByPno(pno, "***부적절한 내용이므로 비공개 처리했습니다***" );
	}

}
