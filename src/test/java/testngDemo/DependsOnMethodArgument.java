package testngDemo;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodArgument 
{
	@Test(priority=1)
	  public void registerTest() 
	  {
		  System.out.println("User Registration test");
		  
		  AssertJUnit.assertEquals(false,true);//Fail
	  }
	  
	  @Test(priority=2,dependsOnMethods ="registerTest",alwaysRun = true)
	  public void loginTest() 
	  {
		  System.out.println("User Login test");
	  }
	  
}
