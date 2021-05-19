import java.time.LocalDate;

import adapter.MerniceServiceAdapter;
import business.concretes.BaseCustomerManager;
import business.concretes.StarbucksCustomerManager;
import entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MerniceServiceAdapter());
		baseCustomerManager.add(new Customer(1, "Esma", "Çelebi", LocalDate.of(55555, 10, 11), "55555555"));	

	}

}
