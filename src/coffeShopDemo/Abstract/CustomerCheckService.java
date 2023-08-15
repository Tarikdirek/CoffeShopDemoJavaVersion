package coffeShopDemo.Abstract;

import coffeShopDemo.Entities.Customer;

public interface CustomerCheckService {
	 boolean CheckIfRealPerson(Customer customer);
}
