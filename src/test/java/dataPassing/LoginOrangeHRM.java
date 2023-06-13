package dataPassing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginOrangeHRM
{
	private WebDriver driver;
	
	public LoginOrangeHRM(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	
	
	
	//locators
	private By username = By.name("username");
	private By password = By.name("password");
	private By loginBtn = By.xpath("//button[@type='submit']");
	
	
	
	//Action
	public void doLogin(String un, String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginBtn).click();
	}
}
