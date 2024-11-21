package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown 
{
	@Test
	public void method1()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.id("searchDropdownBox"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ele.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		ele.sendKeys(Keys.ARROW_DOWN);
		ele.sendKeys(Keys.ARROW_DOWN);
	
		
		
	}

}
