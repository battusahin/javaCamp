
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Batuhan","Þahin","battusahin97@gmail.com");
		
		Student student2 = new Student();
		student2.id = 2;
		student2.name = "Ceyda";
		student2.surname = "Kamalý";
		student2.eMail = "ceyda@gmail.com";
		
		Student[] students = new Student[] {student1,student2};
		
		for (Student student : students) {
			System.out.println(student.id + " Student name & surname: " + student.name + student.surname);
		}
		System.out.println("*********************************************************************");
		
		Instructor instructor1 = new Instructor(1,"Engin","Demiroð");
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.name = "Ahmet";
		instructor2.surname = "Yýlmaz";
		
		Instructor[] instructors = new Instructor[] {instructor1,instructor2};
		for(Instructor instructor : instructors) {
			System.out.println(instructor.id + "Instructor name & surname: " + instructor.name + " " + instructor.surname);
		}
		System.out.println("*********************************************************************");
		
		Category category1 = new Category(1,"Kurslarým");
		Category category2 = new Category(2,"Tüm Kurslar");
		Category category3 = new Category(3,"Kampa Hazýrlýk");
		Category category4 = new Category();
		category4.id = 1;
		category4.name = "Sýk Sorulan Sorular";
		
		Category[] categoryies = new Category[] {category1,category2,category3,category4};
		
		for(Category category : categoryies) {
			System.out.println(category.id + "Category name: " + category.name);
		}
		System.out.println("*********************************************************************");
		
		Card card1 = new Card();
		card1.id = 1;
		card1.courseName = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		card1.description = "PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.";
		card1.instructor = "Engin Demirog";
		card1.courseImage = "img1";
		Card card2 = new Card(2,
				"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin Demiroð",
				"img2");
		Card card3 = new Card(3,
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.",
				"Engin Demirog",
				"img3" );
		
		Card[] cards = new Card[] {card1,card2,card3};
		
		for(Card card : cards) {
			System.out.println(card.id + "Card name: " + card.courseName);
		}
		System.out.println("*********************************************************************");

		StudentManager studentmanager = new StudentManager();
		studentmanager.addStudent(student1);
		studentmanager.addStudent(student2);
		System.out.println("*********************************************************************");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		instructorManager.addInstructor(instructor2);
		System.out.println("*********************************************************************");

		CategoryManager categoryManager = new CategoryManager();
		categoryManager.addCategory(category1);
		categoryManager.addCategory(category2);
		categoryManager.addCategory(category3);
		categoryManager.addCategory(category4);
		
		categoryManager.removeCategory(category1);
		categoryManager.removeCategory(category2);
		
		categoryManager.updateCategory(category3);
		categoryManager.updateCategory(category4);
		System.out.println("*********************************************************************");
		
		CardManager cardManager = new CardManager();
		cardManager.addToCard(card1);
		cardManager.addToCard(card2);
		cardManager.addToCard(card3);
		
		cardManager.removeCard(card1);
		
		cardManager.updateCard(card2);
		cardManager.updateCard(card3);
	}			
}
