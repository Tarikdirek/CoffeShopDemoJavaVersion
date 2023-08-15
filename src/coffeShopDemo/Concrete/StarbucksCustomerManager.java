package coffeShopDemo.Concrete;

import coffeShopDemo.Abstract.BaseCustomerManager;
import coffeShopDemo.Abstract.CustomerCheckService;
import coffeShopDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerChechkService) {
		this.customerCheckService = customerChechkService;
	}

	@Override
	public void Save(Customer customer)  {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
		 super.Save(customer);
		}
		
		System.out.println("Not a valid Person"); 
		
	}

	
	

	

}
