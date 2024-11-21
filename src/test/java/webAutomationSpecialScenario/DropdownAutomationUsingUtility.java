package webAutomationSpecialScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class DropdownAutomationUsingUtility {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//locator
		WebElement ele=driver.findElement(By.id("searchDropdownBox"));
		
		Utility.selectWithIndex(ele,3);
		
		Thread.sleep(2000);
		
		Utility.selectBasedDropdown(ele,"Books");
		
		
		
		
		
		
		
	}

}
