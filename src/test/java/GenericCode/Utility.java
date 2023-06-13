package GenericCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	//public WebDriver driver;
//	public static void scrollDown(WebDriver driver)
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		  
//		 //First way to use of JavascriptExecutor to scroll
//		 js.executeScript("window.scrollTo(0, 8000)");
//	}
	
//	public static void scrollUp(WebDriver driver)
//	{
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		  
//		 //First way to use of JavascriptExecutor to scrollUp
//		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
//	}
	
	
	//javascriptExecutor practice methods
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 5000)");
	}
	
	public static void scrollToElement(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//h2/span[text()='Frequently repurchased in Beauty & Personal Care']"));
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
	}
	
	
	
	
	//ExplicitWait
	public static WebElement waitForElementVisible(WebDriver driver, By btn)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
	}

	public static void main(String[] args) 
	{


	}

}
