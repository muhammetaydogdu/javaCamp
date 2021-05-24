package Abstract;
import Entities.Customer;

public interface CustomerService {
	
	//M��terilerin interface'i.
	
	public void save(Customer customer);		//Kay�t olma operasyonu.
	
	public void updateFirstName(Customer customer, String firstName);		//Kullan�c� Ad� G�ncelleme.
	
	public void deleteAccount(Customer customer);	//Kullan�c�y� silme operasyonu.
	
	
	
}
