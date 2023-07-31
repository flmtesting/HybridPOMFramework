package pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import base.BasePage;

public class Page extends BasePage {

	
	public void validateTitle(String expTitle)
	{
		Assert.assertEquals(driver.getTitle(), expTitle);
		test.log(Status.INFO, "Titles matched...");

	}
	
	
	public void validateURL(String expURL)
	{
		Assert.assertEquals(driver.getCurrentUrl(), expURL);
		test.log(Status.INFO, "URLs  matched...");
	}
	
	public static String  screenshot(String testcaseName)
	{
		String screenShotesFolderPath=System.getProperty("user.dir")+"\\screenshots";
				File reportsFolder=new File(screenShotesFolderPath);
		
		reportsFolder.mkdir();
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date=simpleDateFormat.format(new Date());
		date= date.replace(":", "-");
		
		
		File srcFile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File(screenShotesFolderPath+"\\"+testcaseName+date+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return screenShotesFolderPath+"\\"+testcaseName+date+".png";
	}
	
	
}
