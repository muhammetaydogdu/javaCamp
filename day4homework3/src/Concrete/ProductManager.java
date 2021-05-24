package Concrete;

import Abstract.ProductService;
import Entities.Product;

public class ProductManager implements ProductService  {

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli �r�n ba�ar�yla veritaban�na kaydedilmi�tir.");
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli �r�n ba�ar�yla g�ncellenmi�tir.");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println(product.getProductName()+" isimli �r�n ba�ar�yla veritaban�ndan silinmi�tir.");
	}

	
}
