package dataPassing;


//import org.testng.annotations.Parameters;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import org.testng.Assert;

public class DataPassingXML extends baseclassForBrowserSetup
{
	
	
	
	

  @Test(priority=1)
  public void dataPassingXml() 
  {
	  lp.doLogin("Admin", "admin123");
  }
  
  @Test(priority=2)
  public void verifyurl()
  {
	  //Assert.assertEquals(driver.getCurrentUrl().contains("dashboard"), "");
	  String url = driver.getCurrentUrl();
	  
	  if(url.contains("dashboard"))
	  {
		  System.out.println("url is match!");
	  }
	  else
	  {
		  System.out.println("url is not match");
	  }
  }
}








