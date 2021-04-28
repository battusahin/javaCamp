package classesWithAttirbutes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "laptop", "Asus laptop", 3000, 4, "siyah");    // constructer çalýþýr.
		/*
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		*/

		ProductManager productManager = new ProductManager();
		productManager.add(product);

		System.out.println(product.getKod());
		
		
		
	}

}
