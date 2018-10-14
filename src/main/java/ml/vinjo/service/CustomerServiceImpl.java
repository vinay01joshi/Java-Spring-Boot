package ml.vinjo.service;

import java.util.List;

import ml.vinjo.model.Customer;
import ml.vinjo.repository.CustomerRepository;
import ml.vinjo.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository cusotmerRepository ;
	
	@Override
	public List<Customer> FindAll() {
		return 	cusotmerRepository.FindAll();
	}

	
	public void setCusotmerRepository(CustomerRepository cusotmerRepository) {
		this.cusotmerRepository = cusotmerRepository;
	}
}
