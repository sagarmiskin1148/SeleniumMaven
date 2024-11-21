package listenersDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ProjectListners implements ITestListener
{
  
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Listener executed for Pass Test: "+result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Listener executed for Fail Test: "+result.getName());
	}

}
