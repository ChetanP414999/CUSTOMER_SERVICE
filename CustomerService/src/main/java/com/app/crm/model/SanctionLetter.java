package com.app.crm.model;

import java.sql.Date;

import com.app.crm.enums.LoanStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class SanctionLetter {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sanctionId;
	
	
	private Date sanctionDate;
	
	private String customerName;
	private long customerMobileNumber;
	private double loanAmtSanctioned;
	
	private double totalAmountWithInterest;
	
	private String interestType;
	
	private float rateOfInterest;
	private int loanTentureInMonth;
	private double monthlyEmiAmount;
	private String modeOfPayment;
	private String remarks;
	private String termsCondition;
	
	@Enumerated(EnumType.STRING)
	private LoanStatus sanctionStatus;
	
	@Lob
	@Column(length = 999999999)
	private byte[] sanctionedLetter;
	
	

	
}
