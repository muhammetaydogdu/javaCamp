import java.time.LocalDate;

import Abstract.*;
import Concrete.*;
import Entities.Customer;
import adaptor.MernisServiceAdapter;


public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		baseCustomerManager.save(new Customer(1,"Muhammet O�uzhan","AYDO�DU",LocalDate.of(1997, 8, 28),"31487414158"));
		

	}

}
