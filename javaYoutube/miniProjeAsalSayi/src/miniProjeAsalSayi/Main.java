package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		int number = -1; 
		
		boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Sayý asal deðildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Geçersiz sayý");
			return;
		}
		
		for(int i=2; i<number; i++) {
			if(number%i == 0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("sayý asaldýr.");
		}else{
			System.out.println("sayý asal deðildir");
		}
		
		
		
		
	}

}
