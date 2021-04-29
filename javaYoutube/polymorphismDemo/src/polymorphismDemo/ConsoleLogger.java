package polymorphismDemo;

public class ConsoleLogger extends BaseLogger {

	public void log(String massage) {
		System.out.println("Logged to console: " + massage);
	}
	
}
