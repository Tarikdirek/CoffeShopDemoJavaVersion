package coffeShopDemo.Concrete;

import coffeShopDemo.Abstract.CustomerCheckService;
import coffeShopDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return false;
		
	}

}
