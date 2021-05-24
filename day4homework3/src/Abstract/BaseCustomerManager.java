package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	
	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName()+", ba�ar�yla kaydoldunuz.");
		
	}
	
	@Override
	public void updateFirstName(Customer customer, String firstName) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" ismi, "+firstName+" olarak g�ncellendi.");
		customer.setFirstName(firstName);
		
	}
	
	@Override
	public void deleteAccount(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" hesab�n�z ba�ar�yla silindi.");
		
	}
	
	
}
