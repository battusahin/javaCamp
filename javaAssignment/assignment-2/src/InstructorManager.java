
public class InstructorManager extends UserManager {
	
	
	
	public void createCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName()+ " " + courseName + " kursunu oluþturuldu.");
	}
	
	public void updateCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName() + " " + courseName + " kursunu güncellendi.");
	}
	
	public void removeCourse(Instructor instructor, String courseName) {
		System.out.println(instructor.getFirstName() + " " + courseName + " kursunu Sildi.");
	}
}
