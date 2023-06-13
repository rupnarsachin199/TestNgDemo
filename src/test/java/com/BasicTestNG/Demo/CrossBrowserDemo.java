package com.BasicTestNG.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;

public class CrossBrowserDemo 
{
	WebDriver driver;
	
	@Parameters({"bname"})
  @Test
  public void crossBrowserTest(String bname) 
  {
	  if(bname.equals("chrome"))
	  {
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com");
	  }
	  else if(bname.equals("edge"))
	  {
		  driver = new EdgeDriver();
		  driver.get("https://www.google.com");
	  }
  }
}
