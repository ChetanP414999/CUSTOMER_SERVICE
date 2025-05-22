package com.app.crm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.crm.model.Ledger;
import com.app.crm.service.CustomerService;
@CrossOrigin("*")
@RestController
public class LedgerController {
	
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/installment/{customerId}")
	public ResponseEntity<Ledger> installment(@PathVariable("customerId")int customerId)
	{
		
		Ledger ledger=customerService.installment(customerId);
		System.out.println("---------controller ledger   "+ledger);
		return new  ResponseEntity<Ledger>(ledger,HttpStatus.OK);
		
	}
	@GetMapping("/skip_installment/{customerId}")
	public ResponseEntity<Ledger> skipInstallment(@PathVariable("customerId")int customerId)
	{
		
		Ledger ledger=customerService.skipInstallment(customerId);
		System.out.println("---------controller ledger   "+ledger);
		return new  ResponseEntity<Ledger>(ledger,HttpStatus.OK);
		
	}
	
	@GetMapping("/payInstallment/{ledgerId}")
	public ResponseEntity<Ledger> payInstallment(@PathVariable("customerId")int ledgerId)
	{
		
		Ledger ledger=customerService.installment(ledgerId);
		System.out.println("---------controller ledger   "+ledger);
		return new  ResponseEntity<Ledger>(ledger,HttpStatus.OK);
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
