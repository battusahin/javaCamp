package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer> { // JpaRepository bir tablo(nesne) ve o tablodaki
																		// primarykey typesini alir.Bunun icinde CRUD
																		// islemleri vardir.

	Product getByProductName(String productName);
	//select * from products where product_name= abc
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	//select * from products where product_name= abc and category_id= 1
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	//select * from products where product_name= abc or category_id= 1
	
	List<Product> getByCategoryIn(List<Integer> categories);
	//select * from products where category_id in(1,2,3,4)
	
	List<Product> getByProductNameContains(String productName);
	//select * from products where product_name LIKE '%product_name%'
	
	List<Product> getByProductNameStartsWith(String productName);
	//select * from products where product_name LIKE 'product_name%'
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
	//select * from products where product_name=bisey and category_id=bisey
	
	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto"           //Seçtiğimiz kolonları getirmek için!
			+"(p.id, p.productName, c.categoryName)"
			+" From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	//select p.product_id,p.product_name, c.category_name from products p inner join categories c on p.category_id =c.category_id
}
