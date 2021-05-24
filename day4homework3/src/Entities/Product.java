package Entities;

public class Product {
	
	
	//Sat��� yap�lan �eyler oyun da olsa sonu�ta birer �r�n. �r�n �zellik s�n�f�m�z.
	
	//Attribute field..
		
	private int productId;					//�r�n id.
	private String productName;				//�r�n ad�.
	private String productDescription;		//�r�n a��klamas�.
	private double productPrice;			//�r�n fiyat�.
	
	public Product(int productId, String productName, String productDescription, double productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
	}
	
	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String getProductDescription() {
		return this.productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	

}
