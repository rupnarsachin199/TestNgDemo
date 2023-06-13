package com.BasicTestNG.Demo;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GenericMethodDemo 
{
	public WebDriver driver;
	
	public GenericMethodDemo(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public static void ButtonClick(String id)
	{
		//driver.findElement(By.id(id)).click();
	}

	public static void main(String[] args) 
	{
		
		//GenericMethodDemo gm = new GenericMethodDemo(driver);
	}

}
