package LoginTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SetupBaseClass 
{
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	//browserSetup
	@BeforeMethod
	public void browserSetup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		lp = new LoginPage(driver);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
