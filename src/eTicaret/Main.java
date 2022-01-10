package eTicaret;

import eTicaret.business.abstracts.CustomerService;
import eTicaret.business.concretes.CustomerManager;
import eTicaret.business.concretes.EmailVerify;
import eTicaret.core.concretes.GoogleAdapter;
import eTicaret.dataAccess.concretes.HibernateCustomerDao;
import eTicaret.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(),
				new EmailVerify(), new GoogleAdapter());
        Customer customer1 = new Customer ("oktay", "çamlýca", "oktaycamlica@ornek.com" , "123456" );
	    customerService.login(customer1, "oktaycamlica@ornek.com", "123456");
	
			
			
		
		
	
	
		
	}

}
