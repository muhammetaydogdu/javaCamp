package Abstract;

import Entities.Customer;

public interface CustomerCheckService {

	//Kullan�c� Do�rulama fonksiyonunun temelinin yaz�ld��� yer.
	
	public boolean checkIfRealPerson(Customer customer);
	
}
