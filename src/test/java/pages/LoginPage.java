package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

public class LoginPage extends Page {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']") 
	WebElement usernameTextbox;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement passwordTextbox;
	
	@FindBy(xpath="//button[@type='submit']") 
	WebElement loginButton;
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	WebElement registerLink;
	
	
	public void usernameTextbox(String text)
	{
		usernameTextbox.sendKeys(text);
		test.log(Status.INFO, "Entered text "+text+" into usernameTextbox");
	}
	
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
		test.log(Status.INFO, "Entered text "+text+" into passwordTextbox");
	}
	
	public void loginButton()
	{
		loginButton.click();
		test.log(Status.INFO, "Clicked button loginButton..");
		
	}
	
	public void registerLink()
	{
		registerLink.click();
		test.log(Status.INFO, "Clicked link registerLink..");
		
	}

}
