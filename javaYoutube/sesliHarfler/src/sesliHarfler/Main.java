package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = 'Ü';

		switch (harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("Kalýn sesli harftir.");
			break;

		case 'E':
		case 'Ö':
		case 'Ü':
		case 'Ý':
			System.out.println("Ýnce sesli harftir.");
			break;
		default:
			System.out.println("Sesli harf giriniz.");
		}

	}

}
