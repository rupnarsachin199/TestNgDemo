package DataDrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomData 
{
	@DataProvider(name="testData1")
	@Test
	public Object[][] dataset() {
		Object data[][] = { { "Admin", "admin123" }, { "Sachin", "sandy123" }, { "Parth", "pal123" } };
		return data;
	}
}
