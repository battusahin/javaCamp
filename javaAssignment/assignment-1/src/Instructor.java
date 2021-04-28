
public class Instructor {
	
	int id;
	String name;
	String surname;
	
	public Instructor() {
		System.out.println("Instructor constructor without parameter...");
	}
	
	public Instructor(int id, String name, String surname) {
		System.out.println("Instructor constructor...");
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
}
