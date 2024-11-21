package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentSimpleReport 
{
  @Test
  public void testReport() 
  {
	  ExtentReports extent = new ExtentReports();
	  //path
	  ExtentSparkReporter spark = new ExtentSparkReporter("./"+"/Report/AutomationReport.html");
	  //configuration
	  spark.config().setDocumentTitle("Automation Report");
	  spark.config().setReportName("Test Report1");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attached
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("Automation Sprint1 Report");
	  
	  //log
	  test.pass("Test pass");
	  test.log(Status.FAIL,"Test case is fail");
	  test.log(Status.SKIP, "Test case is skip");
	  test.log(Status.PASS, "Test case is Pass");
	  
	  //close
	  extent.flush();
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
}
