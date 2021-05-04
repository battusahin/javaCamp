import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		BaseCustomerManager customerManager2= new NeroCustomerManager();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Batuhan");
		customer.setLastName("Þahin");
		customer.setDateOfBirth(new Date(1997,3,26));
		customer.setNationalityId("32683080624");
			
		customerManager1.save(customer);
		customerManager2.save(customer);
	

	}

}