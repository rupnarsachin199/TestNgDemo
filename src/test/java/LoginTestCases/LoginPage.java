package LoginTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	private WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Locators
	By username = By.name("username");
	By password = By.name("password");
	By loginBtn = By.xpath("//button[@type='submit']");
			
			
	//Actions
	
	//get title
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	//get current URl
	public String getURL()
	{
		return driver.getCurrentUrl();
	}
	
	//login
	public void doLogin(String un, String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginBtn).click();
			
	}
	
}
