package eTicaret.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaret.dataAccess.abstracts.CustomerDao;
import eTicaret.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{
	List<Customer> customers = new ArrayList<Customer>();

	@Override
	public void add(Customer customer) {
		System.out.println("Kullan�c� sisteme eklendi :"+ customer.getFirstName() + customer.getLastName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Kullan�c� sistemden silindi :" + customer.getFirstName()+ customer.getLastName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Kullan�c� g�ncellendi : " + customer.getFirstName()+ customer.getLastName());
		
	}

	@Override
	public List<Customer> getAll() {
		
		return null;
	}

}
