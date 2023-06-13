package com.open.Browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorDemo 
{
  @Test
  public void javaScriptEcecutor() 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://amazon.in");
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollTo(0,8000)");
  }
}
