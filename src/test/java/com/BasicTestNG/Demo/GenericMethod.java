package com.BasicTestNG.Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GenericMethod
{

	public WebDriver driver;
	
  @Test
  public void clickOnButtons() throws InterruptedException 
  {
	  
	  
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/buttons");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  GenericMethodDemo.ButtonClick("doubleClickBtn");
	  
	  Thread.sleep(2000);
	  
	  GenericMethodDemo.ButtonClick("rightClickBtn");
	  
	  Thread.sleep(2000);
	  
	  GenericMethodDemo.ButtonClick("3aoxv");
	  
	  Thread.sleep(2000);
	  
	  driver.quit();
  }
}
