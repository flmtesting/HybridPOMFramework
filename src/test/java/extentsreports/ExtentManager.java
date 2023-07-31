package extentsreports;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.BasePage;

public class ExtentManager extends BasePage {
	
	static String reportsFolderPath;
	
	public static ExtentReports getReports()
	{
		
		reportsFolderPath=System.getProperty("user.dir")+"\\reports";
		
		if(reports==null)
		{
			
			reports=new ExtentReports();
			
			File reportsFolder=new File(reportsFolderPath);
			
			reportsFolder.mkdir();
			
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			String date=simpleDateFormat.format(new Date());
			date= date.replace(":", "-");
			
			
			String filePath=reportsFolderPath+"\\"+date+".html";
			
			
			ExtentSparkReporter reporter=new ExtentSparkReporter(filePath);
			
			reporter.config().setDocumentTitle("Adactin  QA Regression Results");
			
			reporter.config().setReportName("Regression Reports");
			
			reports.attachReporter(reporter);
			
		}
		
		
		return reports;
	}

}
