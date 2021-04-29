package polymorphismDemo;

public class FileLogger extends BaseLogger {

	public void log(String massage) {
		System.out.println("Logged to file: " + massage);
	}
	
}
