package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	public FileInputStream fis1;
	public Properties configProp;
	public static ExtentReports reports;

	@BeforeTest
	public void fileSetUp() throws IOException {
		fis1 = new FileInputStream("Properties\\config.properties");
		configProp = new Properties();
		configProp.load(fis1);
	}

	@BeforeMethod
	public void setUp() {

		String browserName = configProp.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome"))
		{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} 
		else if (browserName.equalsIgnoreCase("firefox")) 
		{

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} 
		else if (browserName.equalsIgnoreCase("edge"))
		{

			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

		}

		driver.get(configProp.getProperty("url"));

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(configProp.getProperty("implicitWait"))));

	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
