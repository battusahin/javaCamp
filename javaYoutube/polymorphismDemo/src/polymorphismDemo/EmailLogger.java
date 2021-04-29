package polymorphismDemo;

public class EmailLogger extends BaseLogger {

	public void log(String massage) {
		System.out.println("Logged to email: " + massage);
	}
}
