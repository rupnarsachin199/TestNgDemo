package com.BasicTestNG.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import GenericCode.Utility;

public class ExplicitlyWaitDemo 
{
	
	//generic method
	public static WebElement waitForPresenceOfElement(WebDriver driver, By loc)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static WebElement waitForVisibilityOfElementLocated(WebDriver driver, By loc)
	{
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait2.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static WebElement elementToBeClickable(WebDriver driver, By loc)
	{
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	
	
  @Test
  public void explicitWaitTest() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	  
	  
	  //Locate the elements
	  By email = By.name("email");
	  By psw = By.name("password");
	  By btn = By.xpath("//input[@value='Login']");
	  
	  //email
	  waitForPresenceOfElement(driver, email).sendKeys("test123@gmail.com");
	  //emailele.sendKeys("test123@gmail.com");
	  
	  //pass
	  waitForVisibilityOfElementLocated(driver, psw).sendKeys("test@123");
	  
	  
	  //loginBtn
	  elementToBeClickable(driver, btn).click();
	  
//	  WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//	  wait2.until(ExpectedConditions.elementToBeClickable(btn)).click();
  }
}
