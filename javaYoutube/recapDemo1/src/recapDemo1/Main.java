package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		
		// bu 3 say� aras�ndan en b�y�k say�y� bul.
		
		int ebs = sayi3;
		
		if(sayi1 > ebs) {
			ebs = sayi1;
			System.out.println("En b�y�k say�: " + ebs);
		}else if(sayi2 > ebs){
			ebs = sayi2;
			System.out.println("En b�y�k say�: " + ebs);
		}else {
			System.out.println("En b�y�k say�: " + ebs);
		}
		
		
		
		
		
	}

}
