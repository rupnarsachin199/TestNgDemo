package com.BasicTestNG.Demo;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginScenarioAnnotationDemo extends BaseClass
{
	
	
  @Test
  public void logInTest() throws InterruptedException 
  {
	  
	  driver.findElement(By.name("email")).sendKeys("test123@gmail.com");
	  driver.findElement(By.name("password")).sendKeys("pass123");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	  //add wait
	  Thread.sleep(1000);
  }
  
 
}
