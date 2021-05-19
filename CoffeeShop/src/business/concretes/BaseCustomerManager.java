package business.concretes;

import business.abstracts.CustomerService;
import entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		
		System.out.println("Saved To Database " + customer.getFirstName());		
	}

}
