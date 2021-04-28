package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		/*
		 * Mükemmel Sayı: Kendinden başka pozitif tüm tam bölenlerin sayısı kendisine
		 * eşit olan sayılardır. 6 --> 1,2,3 28--> 1,2,4,7,14
		 */

		int number = 1;
		int total = 0;

		if (number == 0) {
			System.out.println("sayı mükemmel sayı değildir.");
			return;
		}

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println("Sayı mükemmel sayıdır");
		} else {
			System.out.println("sayı mükemmel sayı değildir.");
		}
	}

}
