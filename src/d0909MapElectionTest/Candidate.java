package d0909MapElectionTest;

public class Candidate {

	private String name;
	private int voted;
	
	private Candidate(String name) {
		this.name=name;
		this.voted = 0;
	}
	
	public static Candidate Create(String name) {
		return new Candidate(name);
	}
	
	public void voted() {
		this.voted++;
	}
}
