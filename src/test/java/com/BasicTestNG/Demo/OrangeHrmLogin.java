package com.BasicTestNG.Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class OrangeHrmLogin 
{
	public WebDriver driver;
	
	Properties p1 = new Properties();
	public OrangeHrmLogin()
	{

		
		File f1 = new File("./" + "\\config.properties");
		FileInputStream fs;
		try {
			fs = new FileInputStream(f1);
			p1.load(fs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getData(String key)
	{
		return p1.getProperty(key);
	}
	
	
  @Test(priority=1)
  public void doLogin() 
  {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  
	  
	  
	  driver.findElement(By.name("username")).sendKeys(getData("username"));
	  driver.findElement(By.name("password")).sendKeys(getData("password"));
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
  }
}
