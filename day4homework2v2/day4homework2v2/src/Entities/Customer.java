package Entities;

import java.time.LocalDate;

public class Customer {
	private int id;					//M��teri ID
	private String firstName;		//M��teri ad�.
	private String lastName;		//M��teri soyad�.
	private LocalDate dateOfBirth;	//M��teri do�um tarihi.
	private String nationalityId;	//M��teri TC numaras�.
	
	public Customer(int id, String firstName, String lastName,
			LocalDate dateOfBirth,String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return this.dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNationalityId() {
		return this.nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	

}
