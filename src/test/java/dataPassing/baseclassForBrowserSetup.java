package dataPassing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class baseclassForBrowserSetup 
{
	public WebDriver driver;
	public LoginOrangeHRM lp;
	
	
	@BeforeTest
	public void broserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp = new LoginOrangeHRM(driver);	
	}
	
	
	
}
