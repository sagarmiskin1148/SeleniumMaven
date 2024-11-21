package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_CssMethods {

	public static void main(String[] args) throws InterruptedException {
		// Create driver session
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://www.saucedemo.com/v1/");
		
		//css with startswith ^
		driver.findElement(By.cssSelector("input[placeholder ^='User']")).sendKeys("Priyanka");
		
		Thread.sleep(2000);
		
		//css with endwith $
		driver.findElement(By.cssSelector("input[placeholder $='name']")).clear();
		
		Thread.sleep(2000);
		
		//css with contains()
		driver.findElement(By.cssSelector("input[placeholder *='name']")).sendKeys("Priyanka");
	}

}
