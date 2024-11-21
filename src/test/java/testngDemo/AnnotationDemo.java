package testngDemo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo 
{
  @Test(priority=1)
  public void registerTest()
  {
	  System.out.println("This is register test!");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("This is login test!");
  }
  
  @Test(priority=3)
  public void logoutTest()
  {
	  System.out.println("This is logout test!");
  }
  
  //Annotations
  //precodition   postcondition
  
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("BeforeMethod executes before every testcase");
  }
  
  
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod executes after every testcase");
  }
  
  @BeforeClass
  public void bclass() {
	  System.out.println("BeforeClass executes before first test case");
  }
  
  @AfterClass
  public void aclass() {
	  System.out.println("AfterClass executes after last test case");
  }
  
  @BeforeTest
  public void btest()
  {
	  System.out.println("BeforeTEst executes before all classes");
	  
  }
  
  
  @AfterTest
  public void atest()
  {
	  System.out.println("AfterTEst executes after all classes");
	  
  }
  
  @BeforeSuite
  public void bsuite()
  {
	  System.out.println("BeforeSuite executes before test");
  }
  
  
  @AfterSuite
  public void asuite()
  {
	  System.out.println("AfterSuite executes after test");
  }
  
  
  
  
  
 
}
