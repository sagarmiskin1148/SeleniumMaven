package parallelTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Class2 {
  @Test
  public void firefoxTest()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());
  }
}
