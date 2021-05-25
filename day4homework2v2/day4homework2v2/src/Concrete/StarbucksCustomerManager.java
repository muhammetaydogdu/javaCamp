package Concrete;
import Abstract.*;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	//Yukar�da hangi CustomerCheckService kullanaca��m�z de�i�kende tutaca��z.
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		//Buras� parametreli constructor metodumuz.
		//Programc�ya hangi check y�ntemini kullanaca��n� girmesini s�yl�yoruz.
		//Parametresiz constructor olmad��� i�in bu alan zorunlu.
		this.customerCheckService = customerCheckService;
	}
	

	@Override
	public void save(Customer customer) {
		//Base class'�m�zdaki save metodunu burada override ediyoruz.
		if(customerCheckService.checkIfRealPerson(customer))
		{
			//customerCheckServicenin ilgili metoduna customer yolluyoruz.
			//True d�nerse �al��acak blok buras�.
			//Direk checkservice belirtmek yerine, class�n kurucu metodunda
			//belirtilen servisi kullan�yoruz. B�ylelikle kodumuz ba��ms�z.
			super.save(customer);
			//Do�rulama ba�ar�l�ysa, base class'�n save metodunu kullan�yoruz.
		}
		else
		{
			System.out.println("Not a valid person");
			//Buray� daha sonra exceptionHandling ile hallet.
		}
	}
	

}
