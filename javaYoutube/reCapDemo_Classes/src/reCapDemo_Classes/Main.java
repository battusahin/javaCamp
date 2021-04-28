package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		
		// class 1 hesap makinesi uygulamasý topla cýkar çarp böl 2 sayýyý.
		
		DortIslem dortislem = new DortIslem();
		
		int sonuc = dortislem.topla(5, 2);
		System.out.println(sonuc);
	}

}
