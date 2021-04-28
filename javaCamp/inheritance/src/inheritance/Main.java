package inheritance;

public class Main {

	public static void main(String[] args) {
		// inheritance (Miras)
		/*
		 * iki adet s�n�f var bu 2 s�n�fta baz� operasyonlar ortak yap�ya sahip
		 * ya 2 kere yazar�z operasonu ya da inheritance yapar�z.
		 */

		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "758965";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "9999999";
		
		CustomerManager customerManager = new CustomerManager();
		/*
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);
		*/
		Customer[] customers = {engin, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
		
	}

}
