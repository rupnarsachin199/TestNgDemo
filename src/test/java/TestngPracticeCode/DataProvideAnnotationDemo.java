package TestngPracticeCode;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvideAnnotationDemo 
{
	@DataProvider(name="testdata1")
	public Object[][] dataSet()
	{
		Object data[][] = {{"Admin", "admin123"},{"Admin", "test123"},{"admin", "test"}};
		return data;
	}
	
  @Test(dataProvider="testdata1")
  public void login(String un, String psw) 
  {
	  WebDriver driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
	  
	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  String exp = "dashboard";
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains(exp));
	  System.out.println("Login Completed");
  }
}
