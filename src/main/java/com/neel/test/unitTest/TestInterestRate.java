package com.neel.test.unitTest;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.neel.web.model.*;
public class TestInterestRate {

	@Test
	public void TestwithDirectDeposit()
	{
		Eligibility e = new Eligibility();
		e.setDirectDepositMonthly("YES");
		e.setCreditScore("GOOD");
		assertEquals("7.2",Float.toString(e.CalculateInterestBasedonDirectDeposit()));
	}
	
	@Test
	public void TestwithOutDirectDeposit()
	{
		Eligibility e = new Eligibility();
		e.setDirectDepositMonthly("NO");
		e.setCreditScore("BAD");
		assertEquals("16.0",Float.toString(e.CalculateInterestBasedonDirectDeposit()));

	}
	
}
