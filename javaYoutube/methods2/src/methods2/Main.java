package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(1,2,3,4,5);   // hiçbir deðer yollamasakta hata vermmez
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
	public static void guncelle() {
		System.out.println("güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int topla2(int... sayilar) {    // ... birden fazla argument yollayabilmeyi saðlar ve argumanlarýn hepsi dizide tutulur.
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
	
}
