package com.app.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crm.model.Customer;
import com.app.crm.model.Ledger;


public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public Customer findByCustomerId(int customerId);
	public Customer findByCustomerEmailAndPassword(String customerEmail, String password);
	
	public Customer findByUserNameAndPassword(String userName, String password);
	
}
