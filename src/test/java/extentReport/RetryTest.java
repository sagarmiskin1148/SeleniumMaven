package extentReport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest 
{
	//how to retry fail test case in testng
  @Test(retryAnalyzer = extentReport.RetryAnalyzer.class)
  public void retryFailTestCase()
  {
	  Assert.assertEquals(false,true);
  }
}
