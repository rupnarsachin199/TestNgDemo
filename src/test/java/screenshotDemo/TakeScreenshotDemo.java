package screenshotDemo;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.Utility.Genericode;

//import java.io.File;
import java.io.IOException;

public class TakeScreenshotDemo 
{
  @Test
  public void captureScreenshot() throws IOException 
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  
//	  TakesScreenshot ts = (TakesScreenshot)driver;
//	  File temp = ts.getScreenshotAs(OutputType.FILE);
//	  File dest = new File("./" + "\\Screenshot\\pic.png");
//	  FileHandler.copy(temp, dest);
	  Genericode.capture(driver);
  }
}
