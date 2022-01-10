package eTicaret.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eTicaret.business.abstracts.CustomerService;
import eTicaret.business.abstracts.Verify;
import eTicaret.core.abstracts.GoogleService;
import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class CustomerManager implements CustomerService {
	private CustomerDao customerDao;
	private Verify verify;
	private GoogleService googleService;

	

	public CustomerManager(CustomerDao customerDao, Verify verify, GoogleService googleService) {
		super();
		this.customerDao = customerDao;
		this.verify = verify;
		this.googleService = googleService;
		
		String regex = "^(.+)@(\\S+)$";
		Pattern pattern =Pattern.compile(regex);
		
		List<String> checkEmail = new ArrayList<String>();
		
	}

	@Override
	public void add(Customer customer) {
		String checkEmail = "";
		Pattern pattern = null;
		if (customer.getFirstName().length()<2 || customer.getLastName().length()<2) {
			System.out.println("ad ve soyad 2 karakterden küçük olamaz");
			return;
		}else if (customer.getPassword().length()<6) {System.out.println
			("parola en az 6 karakterden oluþmalýdýr");	
		return;
		}else if (checkEmail.contains(customer.geteMail())) {
			System.out.println("Geçerli email" + customer.geteMail());
			return;
		}else if (pattern.matcher(customer.geteMail()).matches()==false) {
			System.out.println("Geçerli bir eposta giriniz. "+customer.getFirstName() 
			+ " ornek@ornek.com");
			return;
		}
		
		this.customerDao.add(customer);
		this.verify.verify(customer);
		this.verify.isVerify(customer);
		
	}

	@Override
	public void login(Customer customer, String eMail, String password) {
		if (customer.geteMail()==eMail || customer.getPassword()==password) {
			System.out.println("baþarýlý giriþ");
			
		}else {
			System.out.println("baþarýsýz giriþ");
		}
		
	}
      
}
