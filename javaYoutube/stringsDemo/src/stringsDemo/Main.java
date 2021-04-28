package stringsDemo;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel";
		System.out.println(mesaj);

/*		
		System.out.println("Eleman say�s�: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4)); // String'te index numaras�na g�re de�eri ald�k.
		System.out.println(mesaj.concat(" Ya�as�n!")); // Stringe metin ekledik
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("H")); // String ne ile ba�l�yor true ya da false.
		System.out.println(mesaj.endsWith("."));   // String ne ile bitiyor.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf('g'));  //Belirtti�imiz karakterin dizide ka��nc� eleman oldugunu bulmaya yarar.
		System.out.println(mesaj.lastIndexOf('z'));
*/
		
		String yeniMesaj = mesaj.replace(' ', '-');   //replace �ok kullan�l�r.dizide bi�eyleri de�i�tirmek i�in
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));    // belirledi�imiz index numaras�ndan itibaren yazd�r�r.
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());  // ba�taki ve sonraki bo�luk karakterlerini kald�r�r.
		
		
		
	}

}
