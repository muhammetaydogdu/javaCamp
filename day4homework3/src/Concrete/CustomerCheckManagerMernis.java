package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManagerMernis implements CustomerCheckService{

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		//TC numaras�n�n kontrol edilip hatal� oldu�unun tespit edildi�i mernis sim�lasyonu.
		return false;
	}
	
}
