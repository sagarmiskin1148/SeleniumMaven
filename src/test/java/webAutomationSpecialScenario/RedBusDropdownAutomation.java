package webAutomationSpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import helper.Utility;

public class RedBusDropdownAutomation {

	public static void main(String[] args)
	{
		//disable notification
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
				
		
		// Create a driver sesssion
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//get the address of from drop down
		
		driver.findElement(By.id("src")).sendKeys("pune");
		
		By fromdd=By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']");
		Utility.dynamicDropdown(driver,fromdd,"Katraj");
		
		//to drop down
		
		driver.findElement(By.id("dest")).sendKeys("Delhi");
		By destdd=By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']");
		Utility.dynamicDropdown(driver,destdd,"Rohini");
		
		
		
		
		
//		//list of options
//		List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
//		
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("Wagholi"))
//			{
//				i.click();
//				break;
//			}
//		}
//		
		
		
//		//list
//		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//text[@class='placeHolderMainText']"));
//		
//		System.out.println("Total Options for Dest drop down: "+list.size());
//		
//		for(WebElement i:list)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("India Gate"))
//			{
//				i.click();
//				break;
//				
//			}
//		}
//		
//		
		

	}

}
