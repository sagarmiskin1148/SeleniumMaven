package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3
{
  @Test(priority=1,description = "Test case1")
  public void registerTest() 
  {
	  System.out.println("User Registration test");
  }
  
  @Test(priority=2,invocationCount = 3,description = "Test case2")
  public void loginTest() 
  {
	  System.out.println("User Login test");
  }
  
  
  @Test(priority=3)
  public void searchTest() 
  {
	  System.out.println("User search Product test");
  }
  
  
  @Test(priority=4)
  public void addToCartTest() 
  {
	  System.out.println("User Addtocart test");
  }
}
