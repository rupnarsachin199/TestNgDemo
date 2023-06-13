package screenshotDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Utility.Genericode;

public class AmazonScreenshotDemo 
{
  @Test
  public void AmazonCaptureScreenshot() 
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  
	  Genericode.capture(driver);
  }
}
