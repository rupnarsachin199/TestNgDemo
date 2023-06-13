package com.open.Browser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest 
{
	WebDriver driver;
	
  @Test(priority=1, description="testCase1")
  public void chromeTest() 
  {
	  //WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
  @Test(priority=2, description="testCase2")
  public void edgeTest()
  {
	  driver = new EdgeDriver();
	  driver.get("https://www.facebook.com");
  }
  
  @AfterMethod
@Test(priority=3, description="browser close")
  public void tearDown()
  {
	  driver.quit();
  }
}
