package Abstract;


import Entities.*;

public interface SaleService {
	
	public void sell(Product product, Customer customer); 				//Kampanyas�z Sat��.
	
	public void addBalance(Customer customer, double amount);			//Bakiye ekleme de bir sat��t�r.

}
