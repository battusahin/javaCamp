package polymorphismDemo;

public class DatabaseLogger extends BaseLogger {
	
	public void log(String massage) {
		System.out.println("Logged to database: " + massage);
	}
}
