package Abstract;

import Entities.*;


public class BaseSaleManager implements SaleService {

	@Override
	public void sell(Product product, Customer customer) {
		// TODO Auto-generated method stub
		//Kampanyas�z standart sat�� operasyonumuz.
		
		double customerBalance = customer.getBalance();
		double productPrice = product.getProductPrice();
		
		if(customerBalance >= productPrice)
		{
			//M��terinin hesab�ndaki bakiye, �r�n fiyat�ndan y�ksekse.
			//K�saca paras� yetiyorsa.
			System.out.println("Say�n "+customer.getFirstName()+","+product.getProductName()+" isimli �r�n�"
					+ "ba�ar�yla sat�n ald�n�z.");
			customerBalance= customerBalance-productPrice;
			System.out.println("Harcama tutar� :"+productPrice);
			System.out.println("Kalan bakiye :"+customerBalance);
			customer.setBalance(customerBalance);
			
			
		}
		else
		{
			System.out.println("Bu sat�n alma i�in yeterli bakiyeye sahip de�ilsiniz.");
			System.out.println("Mevcut bakiyeniz : "+customerBalance);
			System.out.println("Sat�n alma i�in gerekli bakiye :"+(productPrice-customerBalance));
		}
		
	}
	
	@Override
	public void addBalance(Customer customer, double amount) {
		// TODO Auto-generated method stub
		customer.setBalance(customer.getBalance()+amount);
		System.out.println("Bakiye y�kleme ba�ar�l�. Y�kleme tutar� :"+amount+" Yeni bakiyeniz :"+customer.getBalance());
	}

	
	
	
}
