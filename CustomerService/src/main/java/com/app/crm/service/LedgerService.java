package com.app.crm.service;

import java.util.List;

import com.app.crm.model.Ledger;

public interface LedgerService {

public	List<Ledger> getAllLoanEmi(int customerId);

public Ledger findByLedgerId(int ledgerId);
}
