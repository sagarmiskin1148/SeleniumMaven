package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");
		lp=new LoginPage(driver);
		
	}
	
	

}
