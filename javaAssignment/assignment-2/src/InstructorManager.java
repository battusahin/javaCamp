
public class InstructorManager extends UserManager {
	
	
	
	public void createCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName()+ " " + courseName + " kursunu olu�turuldu.");
	}
	
	public void updateCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName() + " " + courseName + " kursunu g�ncellendi.");
	}
	
	public void removeCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName() + " " + courseName + " kursunu Sildi.");
	}
}
