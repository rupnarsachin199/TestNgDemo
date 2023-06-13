package extentReports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsDemo 
{
  @Test
  public void ExtentReport() 
  {
	  //create instance of ExtentReports class
	  ExtentReports report = new ExtentReports();
	  ExtentSparkReporter spark = new ExtentSparkReporter("./" + "Reports/spark.html");
	  
	  //set configuration
	  spark.config().setReportName("AutomationReport");
	  spark.config().setDocumentTitle("Sprint 1 for DataDriver projetc");
	  spark.config().setTheme(Theme.DARK);
	  
	  //create test using ExtentTest class
	  ExtentTest test = report.createTest("My test");
	  
	  //setup logs
	  test.pass("Test Pass!");
	  test.fail("Test Fail!");
	  test.addScreenCaptureFromPath("\\Screenshot");
	  
	  //attach spark reporter to the Extent report
	  report.attachReporter(spark);
	  
	  //exit
	  report.flush();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  //create instance of ExtentReport
//	  ExtentReports report = new ExtentReports();
//	  ExtentSparkReporter spark = new ExtentSparkReporter("./" + "Reports/spark.html");
//	  
//	  //set configuration
//	  spark.config().setReportName("AutomationReport");
//	  spark.config().setDocumentTitle("Sprint 1 for Data Driven");
//	  spark.config().setTheme(Theme.DARK);
//	  
//	  //attach spark to the ExtentReport
//	  report.attachReporter(spark);
//	  
//	  //create test
//	  ExtentTest test = report.createTest("My Test");
//	  
//	  //create logs
//	  test.pass("Test pass!");
//	  test.fail("Test fail!");
//	  test.info("Test information log");
//	  
//	  //add screenshot
//	  test.addScreenCaptureFromPath("./" + "\\Screenshot");
//	  
//	  
//	  //exit
//	  report.flush();
  }
}
