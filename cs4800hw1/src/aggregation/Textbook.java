package aggregation;

public class Textbook {
	private String title;
	private String author;
	private String publisher;
	
	public Textbook(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setTitle(String updatedTitle) {
		this.title = updatedTitle;
	}
	public void setAuthor(String updatedAuthor) {
		this.author = updatedAuthor;
	}
	public void setPublisher(String updatedPublisher) {
		this.publisher = updatedPublisher;
	}
}
