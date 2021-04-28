package oopIntro;

public class Main {

	public static void main(String[] args) {
		 
		// hepsiburada örneði
		
		
		Product product1 = new Product(1,"Lenevo V14", 15000, "16GB Ram",10); // Örnek Oluþturma, Referans oluþturma, intance oluþturma.
		
		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenevo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(1);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());	
	}

}
