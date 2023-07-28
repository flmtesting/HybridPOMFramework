package testscripts.regression;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.Page;
import pages.RegistrationPage;
import utils.UtilKit;

public class ValidateRegistrationDataProvider extends Page {
	
	
	@Test(dataProvider = "getData")
	public void validateRegistrationTest(HashMap<String,String> dataMap)
	{
		
		LoginPage  lp=new LoginPage();
		
		lp.registerLink();
		
		lp.validateTitle(dataMap.get("Expected Title"));
		
		RegistrationPage rp=new RegistrationPage();
		
		rp.userNameTextbox(dataMap.get("Username"));
		
		rp.passwordTextbox(dataMap.get("Password"));
		
		rp.confirmPasswordTextbox(dataMap.get("Confirm Password"));
		
		rp.fullNameTextbox(dataMap.get("Full Name"));
		
		rp.emailAddressTextbox(dataMap.get("Email Address"));
		
		rp.captchaTextbox(dataMap.get("Captcha Text"));
		
		rp.termsAndConditionsCheckbox();
		
		rp.registerButton();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[1][1];
		
		data[0][0]=UtilKit.getTestData("TC-101");
		
		return data;
	}

}
