package coffeShopDemo.Abstract;

import coffeShopDemo.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	public void Save(Customer customer) {
	 	System.out.println(customer.getFirstName()+" saved to db");
		
	}

}
