
public class Card {

	int id;
	String courseName;
	String instructor;
	String description;
	String courseImage;
	
	public Card() {
		System.out.println("Card constructer without parameter...");
	}
	
	public Card(int id,String courseName,String instructor, String description, String courseImage) {
		System.out.println("Card parameters...");
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructor;
		this.description = description;
		this.courseImage = courseImage;
		
	}
		
}
