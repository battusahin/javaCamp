package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		/*
		 * M�kemmel Say�: Kendinden ba�ka pozitif t�m tam b�lenlerin say�s� kendisine
		 * e�it olan say�lard�r. 6 --> 1,2,3 28--> 1,2,4,7,14
		 */

		int number = 1;
		int total = 0;

		if (number == 0) {
			System.out.println("say� m�kemmel say� de�ildir.");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println("Say� m�kemmel say�d�r");
		} else {
			System.out.println("say� m�kemmel say� de�ildir.");
		}
	}

}
