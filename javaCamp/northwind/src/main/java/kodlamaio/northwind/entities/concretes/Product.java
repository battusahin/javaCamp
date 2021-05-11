package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data	//lombok icin    

@Entity		//veritabani nesnesi oldugunu soyler.		
@Table(name = "products")	//veritabaninda hangi tablo oldugu
public class Product {
	
	@Id		//primary key oldugu icin islemler buna gore yapilcak bunu ekliyoruz
	@GeneratedValue		//id nin nasil olusacagini gosterir generatedValue idnin bir bir artcagini gosterir
	@Column(name = "product_id")	// veritabaninda hangi kolona karsilik geldigi		
	private int id;
	
	@Column(name = "category_id")	// veritabaninda hangi kolona karsilik geldigi
	private int categoryId;
	
	@Column(name = "product_name")	// veritabaninda hangi kolona karsilik geldigi
	private String productName;
	
	@Column(name = "unit_price")	// veritabaninda hangi kolona karsilik geldigi
	private double unitPrice;
	
	@Column(name = "units_in_stock")	// veritabaninda hangi kolona karsilik geldigi
	private short unitsInStock;
	
	@Column(name = "quentity_per_unit")	// veritabaninda hangi kolona karsilik geldigi
	private String quantityPerUnit;
	
	public Product() {
		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
	}
	
}
