package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		// class 1 hesap makinesi uygulamas� topla c�kar �arp b�l 2 say�y�.
		
		DortIslem dortislem = new DortIslem();
		
		int sonuc = dortislem.topla(5, 2);
		System.out.println(sonuc);
	}

}
