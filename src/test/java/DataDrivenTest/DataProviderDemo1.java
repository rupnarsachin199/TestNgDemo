package DataDrivenTest;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
//	@DataProvider(name="testData1")//using data inside the same class
//	@Test
//	public Object[][] dataset() {
//		Object data[][] = { { "Admin", "admin123" }, { "Sachin", "sandy123" }, { "Parth", "pal123" } };
//		return data;
//	}
	
	
	
	@Test(dataProvider="testData1", dataProviderClass = CustomData.class)//using data inside the another class
	public void loginTest(String un, String psw)
	{
		
		System.out.println("username is:" + un);
		System.out.println("password is: " + psw);
	}
}
