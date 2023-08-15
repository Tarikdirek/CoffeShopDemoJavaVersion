package coffeShopDemo;

import java.util.Date;

import coffeShopDemo.Abstract.BaseCustomerManager;
import coffeShopDemo.Abstract.CustomerCheckService;
import coffeShopDemo.Concrete.CustomerCheckManager;
import coffeShopDemo.Concrete.NeroCustomerManager;
import coffeShopDemo.Concrete.StarbucksCustomerManager;
import coffeShopDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		Customer tarikCustomer = new Customer(1, "Tarik", "Direk", new Date(1994,1,8), "38293178090");
		customerManager.Save(tarikCustomer);
	}

}
