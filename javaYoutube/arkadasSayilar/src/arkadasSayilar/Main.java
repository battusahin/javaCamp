package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		/*
		 *  Arkada� Say�lar: bilinen en k���k arkada� say�lar 220 ve 284't�r
		 *  				�ki say� birbirinin kendisi hari� b�lenleri toplam�na e�itse bu say�lara arkada� say�lar denir.
		 * 
		 */
		
	int number1=17296;
	int number2=18416;
	int total1=0;
	int total2=0;
	
	for(int i=1; i<number1; i++) {
		if(number1 % i == 0) {
			total1 += i;
		}
	}
	for(int j=1; j<number2; j++) {
		if(number2 % j == 0) {
			total2 += j;
		}
	}
	if(total1==number2 && total2==number1) {
		System.out.println("Say�lar arkada� say�d�r.");
	}else {
		System.out.println("say�lar arkada� say� de�ildir.");
	}
		
		
		
		
		
		
	}

}
