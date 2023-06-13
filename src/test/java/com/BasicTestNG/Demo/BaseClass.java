package com.BasicTestNG.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
	public WebDriver driver;
	
	@BeforeClass
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	 @AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }
}
