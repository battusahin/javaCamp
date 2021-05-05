package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;

public class Product implements Entity {
	
	private int id;
	private int categoryId;
	private String name;
	private double unitprice;
	private int unitInStock;
	
	public Product() {
		
	}

	public Product(int id, int categoryId, String name, double unitprice, int unitInStock) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.name = name;
		this.unitprice = unitprice;
		this.unitInStock = unitInStock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	
	
	
	
}
