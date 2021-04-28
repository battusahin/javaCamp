package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);

/*		
		System.out.println("Eleman sayýsý: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4)); // String'te index numarasýna göre deðeri aldýk.
		System.out.println(mesaj.concat(" Yaþasýn!")); // Stringe metin ekledik
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("H")); // String ne ile baþlýyor true ya da false.
		System.out.println(mesaj.endsWith("."));   // String ne ile bitiyor.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('g'));  //Belirttiðimiz karakterin dizide kaçýncý eleman oldugunu bulmaya yarar.
		System.out.println(mesaj.lastIndexOf('z'));
*/
		
		String yeniMesaj = mesaj.replace(' ', '-');   //replace çok kullanýlýr.dizide biþeyleri deðiþtirmek için
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));    // belirlediðimiz index numarasýndan itibaren yazdýrýr.
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());  // baþtaki ve sonraki boþluk karakterlerini kaldýrýr.
		
		
		
	}

}
