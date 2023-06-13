package com.BasicTestNG.Demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlDataPassing 
{
  @Parameters({"id", "name"})
  @Test
  public void testcase(int id, String name) 
  {
	  System.out.println("id is: " + id);
	  System.out.println("name is: " + name);
  }
}
