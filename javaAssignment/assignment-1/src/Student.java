
public class Student {
	
	int id;
	String name;
	String surname;
	String eMail;
	
	public Student() {
		System.out.println("Student constructer without parameter...");
	}
	
	public Student(int id, String name, String surname, String eMail) {
		System.out.println("Student constructor...");
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
	}
	
	
	
}
