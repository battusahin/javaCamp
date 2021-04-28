package inheritance;

public class Main {

	public static void main(String[] args) {
		// inheritance (Miras)
		/*
		 * iki adet sýnýf var bu 2 sýnýfta bazý operasyonlar ortak yapýya sahip
		 * ya 2 kere yazarýz operasonu ya da inheritance yaparýz.
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
