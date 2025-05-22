package com.app.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.crm.model.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Integer>{
	public Ledger findByLedgerId(int ledgerId);

}
