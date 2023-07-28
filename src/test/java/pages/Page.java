package pages;

import org.testng.Assert;

import base.BasePage;

public class Page extends BasePage {

	
	public void validateTitle(String expTitle)
	{
		Assert.assertEquals(driver.getTitle(), expTitle);
	}
	
	
	public void validateURL(String expURL)
	{
		Assert.assertEquals(driver.getCurrentUrl(), expURL);
	}
	
	
}
