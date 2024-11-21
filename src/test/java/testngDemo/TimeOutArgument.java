package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TimeOutArgument 
{
  @Test(timeOut = 4000)
  public void testCase1() throws InterruptedException
  {
	  System.out.println("Test start");
	  Thread.sleep(3000);
	  System.out.println("Test timeout is 3000ms=3sec");
  }
}
