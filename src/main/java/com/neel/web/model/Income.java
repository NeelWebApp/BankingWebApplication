package com.neel.web.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;


public class Income {
	
	@NotEmpty(message = "Please enter your SSN.")
	@Size(min=9, max=9, message = "SSN should be nine digits")
	String applSSN;

	@NotEmpty(message = "Please select Income Mode.")
	String incomemode;
	
	@NotEmpty(message = "Please enter Income Amount.")
	String applincome;
	
	@NotEmpty(message = "Please select Rent or Own")
	String RentorOwn;
	
	@NotEmpty(message = "Please enter Income Amount.")
	String rentorleaseamt;
	
	public String getApplSSN() {
		return applSSN;
	}

	public void setApplSSN(String applSSN) {
		this.applSSN = applSSN;
	}

	public String getIncomemode() {
		return incomemode;
	}

	public void setIncomemode(String incomemode) {
		this.incomemode = incomemode;
	}

	public String getApplincome() {
		return applincome;
	}

	public void setApplincome(String applincome) {
		this.applincome = applincome;
	}

	public String getRentorOwn() {
		return RentorOwn;
	}

	public void setRentorOwn(String rentorOwn) {
		RentorOwn = rentorOwn;
	}

	public String getRentorleaseamt() {
		return rentorleaseamt;
	}

	public void setRentorleaseamt(String rentorleaseamt) {
		this.rentorleaseamt = rentorleaseamt;
	}
		
}
