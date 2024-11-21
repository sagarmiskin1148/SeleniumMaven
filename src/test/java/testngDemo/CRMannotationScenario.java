package testngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class CRMannotationScenario extends BaseClass
{
	//WebDriver driver;
	
//	@BeforeClass
//	public void setUp()
//	{
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://automationplayground.com/crm/");
//		
//	}
//	@BeforeMethod
//	public void getAppTitle()
//	{
//		System.out.println("Title is: "+driver.getTitle());
//	}
//	
//	@AfterMethod
//	public void getAppUrl()
//	{
//		System.out.println("Url is: "+driver.getCurrentUrl());
//	}
//	
  @Test(priority=1)
  public void verifySignINLink()
  {
	  driver.findElement(By.id("SignIn")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Fail:url not match");
	  System.out.println("Pass: Url matched!");
  }
  
  @Test(priority=2)
  public void verifySignIn()
  {
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Fail");
	  System.out.println("Login Pass!");
	  
  }
  
  @Test(priority=3)
  public void verifySingOut()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
  }
  
//  @AfterClass
//  public void tearDown() throws InterruptedException
//  {
//	  Thread.sleep(3000);
//	  driver.quit();
//  }
}

