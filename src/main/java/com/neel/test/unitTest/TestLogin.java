package com.neel.test.unitTest;

import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Test;
import com.neel.web.model.*;


public class TestLogin {

	@Test
	public void TestLoginwithvalidPassword()
	{
		Login login = new Login();
		assertFalse(login.validatePassword(""));
	}	
	@Test
	public void TestLoginwithInvalidPassword()
	{
		Login login = new Login();
		assertFalse(login.validatePassword("welcome100"));
	}

	
}
