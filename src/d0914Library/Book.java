package d0914Library;

public class Book {
	
	private Long bid;
	private static Long cnt;
	private String name;
	private String author;
	private String publicationDate;
	
	public Book(String name, String author, String publicationDate) {
		bid = ++cnt;
		this.author = author;
		this.publicationDate = publicationDate;
	}

	public Long getBid() {
		return bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	

}
