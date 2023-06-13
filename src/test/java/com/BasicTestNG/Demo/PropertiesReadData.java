package com.BasicTestNG.Demo;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadData 
{
  @Test
  public void readFile() throws IOException
  {
	 File f1  = new File("./" + "\\config.properties");
	 FileInputStream fs = new FileInputStream(f1);
	 
	 Properties p1 = new Properties();
	 p1.load(fs);
	 
	 System.out.println("Broesr name is: " + p1.getProperty("browserName"));
	 System.out.println("Browser version is: " + p1.getProperty("browserVersion"));
  }
}
