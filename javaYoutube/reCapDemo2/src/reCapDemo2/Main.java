package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList = {1.2, 15.6, 4.3, 5.6};
		// bu sayýlarý ekrana tek tek yazdýrma.
		// en büyük sayýyý bulma
		// 3 sayýnýn toplamýný bulma.
		
		double ebs = myList[3];
		double toplam = 0;
		
		for(double number : myList) {
			if(myList[0] > ebs) {
				ebs = myList[0];
			}else if(myList[1] > ebs){
				ebs = myList[1];
			}else if(myList[2] > ebs){
				ebs = myList[2];
			}
			toplam += number;
			System.out.println(number);
		}
		
		
		System.out.println("En büyük sayý: " + ebs);
		System.out.println("Toplamlarý: " + toplam);
						
		
	}

}
