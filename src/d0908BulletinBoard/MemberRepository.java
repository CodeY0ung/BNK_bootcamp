package d0908BulletinBoard;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
	
	List<User> ul = new ArrayList<>();
	
	//create
	public void create(User u) {
		ul.add(u);
	}
	
	//read
	public User findById(String id) {
		for(User u : ul) {
			if(u.getId().equals(id)) {
				return u;
			}
		}
		return null;
	}
	
	public List<User> findAll() {
		return ul;
	}
	
	// delete

}
