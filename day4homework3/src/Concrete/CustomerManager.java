package Concrete;

import Abstract.*;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager {
	
	CustomerCheckService checkService;
	
	public CustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) {
	
		
		
		if(this.checkService.checkIfRealPerson(customer)) {
			//Do�rulama true d�nd�r�rse;
			super.save(customer);
		}
		else
		{
			//Do�rulama hatal�ysa.
			System.out.println(customer.getFirstName()+" kay�t ba�ar�s�z. Bilgilerinizi kontrol edip tekrar deneyin.");
		}
		
		
		
	}

}
