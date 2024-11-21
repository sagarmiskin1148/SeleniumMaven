package webAutomationSpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class FacebookDropDownAutomation
{
	
	
	
	

	public static void main(String[] args)
	{

		//Create a session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		//create new account
		driver.findElement(By.linkText("Create new account")).click();
		
		//daydropdown
		WebElement dayele=driver.findElement(By.id("day"));
		Utility.selectBasedDropdown(dayele,"27");
		
		//monthdropdown
		WebElement monthele=driver.findElement(By.id("month"));
		Utility.selectBasedDropdown(monthele,"Dec");
				
		//yeardropdown
		WebElement yearele=driver.findElement(By.id("year"));
		Utility.selectBasedDropdown(yearele,"2010");
		
		
		
		
		
		
		
//		//select class
//		Select daydd=new Select(dayele);
//		
//		System.out.println("Is dropdown support multiple selection?: "+daydd.isMultiple());
//		
//		List<WebElement> allOptions=daydd.getOptions();
//		System.out.println("Total Options are: "+allOptions.size());
//		
//		for(WebElement i:allOptions)
//		{
//			System.out.println(i.getText());
//			if(i.getText().contains("28"))
//			{
//				i.click();
//				break;
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
