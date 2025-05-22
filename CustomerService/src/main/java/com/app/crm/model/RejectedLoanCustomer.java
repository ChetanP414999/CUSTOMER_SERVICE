package com.app.crm.model;

import com.app.crm.enums.LoanStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RejectedLoanCustomer {
	@Id
	private int customerId;
	private String customerName;
	private String customerDateOfBirth;
	private int customerAge;
	
	private String gender;
	private String customerEmail;
	private long cutomerMobileNumber;
	private long customerAdditionalMobileNumber;
	private double customerAmmountPaidForCarloan;
	private double customerTotalLoanRequiredAmmount;
	private String password;
	private int loanTentureInMonth;

	@Enumerated(EnumType.STRING)
	private LoanStatus loanStatus;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private AllPersonalDocuments allPersonalDocuments;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DependantInformation dependantInformation;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private MedicalInfo medicalInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails previousLoanDetails;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private GuarantorDetails guarantorDetails;
	
@OneToOne(cascade = CascadeType.ALL)
	private SanctionLetter sanctionLetter;


@OneToOne(cascade = CascadeType.ALL)
private LoanDisbursement disbursement;


@OneToOne(cascade = CascadeType.ALL)
private AccountDetails accountDetails;
}


