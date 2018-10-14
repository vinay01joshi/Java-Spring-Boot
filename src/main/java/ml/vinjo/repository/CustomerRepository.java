package ml.vinjo.repository;

import java.util.List;

import ml.vinjo.model.Customer;

public interface CustomerRepository {

	List<Customer> FindAll();

}