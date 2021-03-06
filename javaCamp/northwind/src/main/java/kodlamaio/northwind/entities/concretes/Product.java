package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data	//lombok icin    

@Entity		//veritabani nesnesi oldugunu soyler.		
@Table(name = "products")	//veritabaninda hangi tablo oldugu
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id		//primary key oldugu icin islemler buna gore yapilcak bunu ekliyoruz
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//id nin nasil olusacagini gosterir generatedValue idnin bir bir artcagini gosterir
	@Column(name = "product_id")	// veritabaninda hangi kolona karsilik geldigi		
	private int id;
	
	//@Column(name = "category_id")	// veritabaninda hangi kolona karsilik geldigi
	//private int categoryId;
	
	@Column(name = "product_name")	// veritabaninda hangi kolona karsilik geldigi
	private String productName;
	
	@Column(name = "unit_price")	// veritabaninda hangi kolona karsilik geldigi
	private double unitPrice;
	
	@Column(name = "units_in_stock")	// veritabaninda hangi kolona karsilik geldigi
	private short unitsInStock;
	
	@Column(name = "quentity_per_unit")	// veritabaninda hangi kolona karsilik geldigi
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;
}
