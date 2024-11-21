package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Utility;

public class WebDriverWaitDemo {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		boolean status=Utility.waitForUrlMatch(driver,"ninja");
		System.out.println("Status of current url is: "+status);
		
		boolean title=Utility.waitForTitleMatch(driver,"Login");
		System.out.println("Status of title is: "+title);
		
		//by locator
		By email=By.id("input-email");
		By pass=By.name("password");
		By btn=By.xpath("//input[@value='Login']");
		
		Utility.waitForPresenceOfElement(driver,email).sendKeys("test@gmail.com");
		Utility.waitForVisibilityOfElement(driver,pass).sendKeys("test123");
		Utility.waitForElementToClick(driver, btn).click();
		
		
		
		
		/*
		 * TimeoutException: Expected condition failed:
		 *  waiting for presence of element located by: 
		 * By.id: input-email### 
		 * (tried for 5 second(s) with 500 milliseconds interval)
		 * interval time is polling time
		 * default time for selenium is 500ms 0.5 sec
		 * 
		 */
		//element is present in DOM
//		WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
//		WebElement ele=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
//		
//		ele.sendKeys("test@gmail.com");
//		
		
		
		
	}

}
