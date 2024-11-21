package listenersDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ProjectListners.class)
public class GoogleTest
{
  @Test(priority=1)
  public void googleUrl() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  Assert.assertTrue(driver.getCurrentUrl().contains("google"),"Url is not matched!");
	  System.out.println("Url is matched!");
  }
  
  @Test(priority=2)
  public void googleTitle() 
  {
	 WebDriver driver=new ChromeDriver();
  driver.get("https://www.google.com");
  Assert.assertTrue(driver.getTitle().contains("GoogleApp"),"Title is not matched!");
  System.out.println("Title is matched!");
  }
}
