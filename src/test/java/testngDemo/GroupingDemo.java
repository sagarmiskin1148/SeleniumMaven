package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupingDemo 
{
  @Test(priority=1,groups = "SmokeTest")
  public void openApplication()
  {
	  System.out.println("Validate Url and open application");
  }
  
  @Test(priority=2,groups = "FunctionalTest")
  public void loginTest()
  {
	  System.out.println("Validate Login for valid credentials");
  }
  
  @Test(priority=3,groups = "FunctionalTest")
  public void logoutTest()
  {
	  System.out.println("Validate Logout for valid credentials");
  }
  
  @Test(priority=4,groups = "performaceTest")
  public void loadTest()
  {
	  System.out.println("Validate of 100 users are able to access application at a time");
  }
  
}
