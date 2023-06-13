package com.BasicTestNG.Demo;

import org.testng.annotations.Test;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;

public class BrowserDemoTest 
{
	WebDriver driver;
	
  
  @Test(priority=1)
  public void chromeTest() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  
//  @Test(priority=2)
//  public void tearDown1()
//  {
//	  driver.quit();
//  }
  
  @Test(priority=2)
  public void edgeTest()
  {
	  driver = new EdgeDriver();
	  driver.get("https://www.facebook.com");
  }
  

//@Test(priority=4)
//  public void tearDown()
//  {
//	  driver.quit();
//  }
}
