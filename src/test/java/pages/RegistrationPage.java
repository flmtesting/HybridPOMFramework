package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends Page{
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	WebElement userNameTextbox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordTextbox;
	
	
	@FindBy(xpath="//input[@name='re_password']")
	WebElement confirmPasswordTextbox;
	
	@FindBy(xpath="//input[@name='full_name']")
	WebElement fullNameTextbox;
	
	@FindBy(xpath="//input[@name='email_add']")
	WebElement emailAddressTextbox;
	
	@FindBy(xpath="//input[@name='captcha']")
	WebElement captchaTextbox;
	
	@FindBy(xpath="//input[@name='tnc_box']")
	WebElement termsAndConditionsCheckbox;
	
	@FindBy(xpath="//input[@name='Submit']")
	WebElement registerButton;
	
	
	public void userNameTextbox(String text)
	{
		userNameTextbox.sendKeys(text);
	}
	
	public void passwordTextbox(String text)
	{
		passwordTextbox.sendKeys(text);
	}
	
	public void confirmPasswordTextbox(String text)
	{
		confirmPasswordTextbox.sendKeys(text);
	}
	
	public void fullNameTextbox(String text)
	{
		fullNameTextbox.sendKeys(text);
	}
	
	public void emailAddressTextbox(String text)
	{
		emailAddressTextbox.sendKeys(text);
	}
	
	public void captchaTextbox(String text)
	{
		captchaTextbox.sendKeys(text);
	}
	
	public void termsAndConditionsCheckbox()
	{
		if(!termsAndConditionsCheckbox.isSelected())
		{
		termsAndConditionsCheckbox.click();
		}
	}
	
	public void registerButton()
	{
		registerButton.click();
	}
	
	

}
