package testscripts.regression;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Page;
import pages.RegistrationPage;

public class ValidateRegistration extends Page {
	
	
	@Test
	public void validateRegistrationTest()
	{
		
		LoginPage  lp=new LoginPage();
		
		lp.registerLink();
		
		lp.validateTitle("Adactin.com - New User Registration");
		
		RegistrationPage rp=new RegistrationPage();
		
		rp.userNameTextbox("reyaz2707");
		
		rp.passwordTextbox("reyaz123");
		
		rp.confirmPasswordTextbox("reyaz123");
		
		rp.fullNameTextbox("Reyaz S");
		
		rp.emailAddressTextbox("abcd@gmail.com");
		
		rp.captchaTextbox("fermery");
		
		rp.termsAndConditionsCheckbox();
		
		rp.registerButton();
		
	}
	

}
