package ml.vinjo.repository;

import java.util.ArrayList;
import java.util.List;

import ml.vinjo.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see ml.vinjo.repository.CustomerRepository#FindAll()
	 */
	@Override
	public List<Customer> FindAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Vinay");
		customer.setLastName("Joshi");
		
		customers.add(customer);
		
		return customers;
	}
}
