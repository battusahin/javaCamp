package methods;

public class Main {

	public static void main(String[] args) {
		
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 12;
		boolean varMi = false;
		
		for(int i=0; i<sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			mesajVer("arad���m�z say� dizide var " + aranacak);
		}else {
			mesajVer("arad���m�z say� dizide yoktur " + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
	
	
	

}
