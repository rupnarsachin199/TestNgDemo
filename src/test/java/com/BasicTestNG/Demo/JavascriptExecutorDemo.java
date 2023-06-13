package com.BasicTestNG.Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import GenericCode.Utility;

//import GenericCode.Utility;

public class JavascriptExecutorDemo 
{
  @Test
  public void JsExecutorDemo() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  //scroll to specific element
	  Utility.scrollToElement(driver);
	  Thread.sleep(1000);
	  Utility.scrollDown(driver);
	  Thread.sleep(1000);
	  
	 
	  
	  
	  
	  
	  
	  
	  //Using generic method
//	  Utility.scrollDown(driver);
//	  
//	  Thread.sleep(1000);
//	  
//	  Utility.scrollUp(driver);
	  
	  
	  
	  
	  //JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	  //First way to use of JavascriptExecutor to scroll
	  //js.executeScript("window.scrollTo(0, 8000)");
	  
	  
	//Second way to use of JavascriptExecutor to scroll
	  //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	  
	  //Thread.sleep(2000);
	  
	  //scroll up
	  //js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	  
	  //Thread.sleep(2000);
	  
	  
	  //Scroll to till the element
//	  WebElement btn = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
//	  JavascriptExecutor js = (JavascriptExecutor)driver;
//	  js.executeScript("arguments[0].scrollIntoView(true)", btn);
//	  Thread.sleep(2000);
	  driver.quit();
  }
}
