package testngDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
		
	}
	@BeforeMethod
	public void getAppTitle()
	{
		System.out.println("Title is: "+driver.getTitle());
	}
	
	@AfterMethod
	public void getAppUrl()
	{
		System.out.println("Url is: "+driver.getCurrentUrl());
	}
	
	@AfterClass
	  public void tearDown() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  driver.quit();
	  }

}
