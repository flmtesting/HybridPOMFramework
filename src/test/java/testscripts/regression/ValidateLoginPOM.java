package testscripts.regression;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.BasePage;
import pages.LoginPage;
import pages.Page;

public class ValidateLoginPOM extends Page {
	
	
	@Test
	public void ValidateLoginTest() throws InterruptedException
	{
		
		//ClassName objectName=new ClassName();
		
		//LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
		
		LoginPage lp=new LoginPage();
		
		lp.usernameTextbox("Admin");
		
		lp.passwordTextbox("admin123");
		
		lp.loginButton();
		
		Thread.sleep(3000);
		
		
		lp.validateURL("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		
	}
	

}
