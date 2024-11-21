package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//Encapsulation=data+method
	private WebDriver driver;
	
	//Initialize driver
	public LoginPage(WebDriver driver)//base class driver
	{
		this.driver=driver;
	}
	
	//locators-By locator
	private By email=By.id("email-id");
	private By password=By.id("password");
	private By btn=By.id("submit-id");
	
	//methods
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void doLogin(String emailid,String psw)
	{
		driver.findElement(email).sendKeys(emailid);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(btn).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
