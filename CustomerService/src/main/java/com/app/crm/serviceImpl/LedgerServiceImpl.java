package com.app.crm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.crm.model.Customer;
import com.app.crm.model.Ledger;
import com.app.crm.repository.CustomerRepository;
import com.app.crm.repository.LedgerRepository;
import com.app.crm.service.LedgerService;

@Service
public class LedgerServiceImpl implements LedgerService{

	
	@Autowired
private LedgerRepository ledgerRepository;
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Ledger> getAllLoanEmi(int customerId) {
		
		Customer customer = customerRepository.findById(customerId).get();
		return customer.getLedger();
	}

	@Override
	public Ledger findByLedgerId(int ledgerId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
