package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("for D�ng�s� bitti...");

		
		// while
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("while D�ng�s� bitti...");

		
		// do-while d�ng�s�
		int j = 100;
		do {
			System.out.println("Logland�");
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("do-while d�ng�s� bitti...");

	}

}
