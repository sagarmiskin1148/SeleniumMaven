package seleniumWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(4));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(40));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		
		
		
		
		//by locator
				By email=By.id("input-email");
				By pass=By.name("password");
				By btn=By.xpath("//input[@value='Login']");
				
				//Wait is interface
				Wait<WebDriver> obj =new FluentWait<>(driver)
				            .withTimeout(Duration.ofSeconds(5))
				            .pollingEvery(Duration.ofMillis(300))
				            .ignoring(NoSuchElementException.class);
				
				obj.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
				
				
				
				
				
	}

}
