package com.neel.web.model;

import org.hibernate.validator.constraints.NotEmpty;


public class Eligibility {
	
	@NotEmpty(message = "Please enter your Account Type.")
	String accounttype;

	@NotEmpty(message = "Please select Initial Deposit.")
	String intialDeposit;
	
	@NotEmpty(message = "Please select Direct Deposit value.")
	String directDepositMonthly;
	
	@NotEmpty(message = "Please select Debit card Type")
	String debitCardVisaMaster;
	
	@NotEmpty(message = "Please enter Loan Requirement Amount.")
	String loanRequirement;
	
	@NotEmpty(message = "Please select Credit score")
	String creditScore;

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getIntialDeposit() {
		return intialDeposit;
	}

	public void setIntialDeposit(String intialDeposit) {
		this.intialDeposit = intialDeposit;
	}

	public String isDirectDepositMonthly() {
		return directDepositMonthly;
	}

	public void setDirectDepositMonthly(String directDepositMonthly) {
		this.directDepositMonthly = directDepositMonthly;
	}

	public String getDebitCardVisaMaster() {
		return debitCardVisaMaster;
	}

	public void setDebitCardVisaMaster(String debitCardVisaMaster) {
		this.debitCardVisaMaster = debitCardVisaMaster;
	}

	public String getLoanRequirement() {
		return loanRequirement;
	}

	public void setLoanRequirement(String loanRequirement) {
		this.loanRequirement = loanRequirement;
	}

	public String getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(String creditScore) {
		this.creditScore = creditScore;
	}

	public String getDirectDepositMonthly() {
		return directDepositMonthly;
	}
	
	public int BaseInterestRateForCreditRating()
	{
		
		switch(creditRating.valueOf(this.getCreditScore())) 
		{
		    case EXCELLENT:
		        return 4;
		    case GOOD:
		    	return 8;
		    case FAIR:
		    	return 12;
		    case BAD:
		    	return 16;
		    default:
		        return 0;
		        
		}
	}	
	public float CalculateInterestBasedonDirectDeposit()
	{
		float baseInterestRate=this.BaseInterestRateForCreditRating();
			if (this.getDirectDepositMonthly().equalsIgnoreCase("YES"))
			{
				return (baseInterestRate-(baseInterestRate * 10/100));
			}
		return baseInterestRate;
			
		
	}
	
	public enum creditRating
	{
		EXCELLENT,
		GOOD,
		FAIR,
		BAD
	}
}
