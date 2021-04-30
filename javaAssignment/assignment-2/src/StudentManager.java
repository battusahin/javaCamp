
public class StudentManager extends UserManager {
	
	public void addCourse(Student student, String courseName) {
		System.out.println(student.getFirstName() + " " + courseName + "-Kursunu Profiline Ekledi." );
	}
	
	
}
