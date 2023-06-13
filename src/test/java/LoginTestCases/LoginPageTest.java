package LoginTestCases;

import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginPageTest extends SetupBaseClass
{
	//Title
	@Test(priority=1)
	  public void verifyTitle() 
	  {
		  String actTite = lp.getAppTitle();
		  Assert.assertEquals(actTite, "OrangeHRM", "title not match");
		  System.out.println("Title is match!");
	  }
	
	//URL
	@Test(priority=2)
	  public void verifyUrl() 
	  {
		System.out.println(lp.getURL());
		  
	  }
	
	
//valid user name and password
  @Test(priority=3)
  public void verifyValidUnAndPsw() 
  {
	  lp.doLogin("Admin", "admin123");
	  
	  System.out.println("Login successful");
  }
  
  
  //valid user name and invalid password
  
  @Test(priority=4)
  public void verifyValidUnAndInvalidPsw()
  {
	  lp.doLogin("Admin", "admin");
	  
	  System.out.println("Login failed");
	  

  }
  
  
  //invalid user name and valid password
  @Test(priority=5)
  public void invalidUnAndPsw()
  {
	  lp.doLogin("adm", "admin123");
	 
	  System.out.println("Login failed");
	  
	 // driver.navigate().back();
  }
  
  
  //invalid user name and invalid password
  
  @Test(priority=6)
  public void invalidUnAndInvalidPsw()
  {
	  lp.doLogin("adm", "Admin12");
	 
	  System.out.println("Login failed");
  }

}
