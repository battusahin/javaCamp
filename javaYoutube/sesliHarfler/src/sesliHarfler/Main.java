package sesliHarfler;

public class Main {

	public static void main(String[] args) {

		char harf = '�';

		switch (harf) {
		case 'A':
		case 'O':
		case 'U':
		case 'I':
			System.out.println("Kal�n sesli harftir.");
			break;

		case 'E':
		case '�':
		case '�':
		case '�':
			System.out.println("�nce sesli harftir.");
			break;
		default:
			System.out.println("Sesli harf giriniz.");
		}

	}

}
