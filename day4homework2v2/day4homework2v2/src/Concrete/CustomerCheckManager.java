package Concrete;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService  {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// Fake Check S�n�f�m�z. Test ama�l� kullanaca��z.
		return true;
	}
	
}
