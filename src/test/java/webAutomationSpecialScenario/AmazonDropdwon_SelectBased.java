package webAutomationSpecialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import helper.Utility;

public class AmazonDropdwon_SelectBased {

	public static void main(String[] args) throws InterruptedException 
	{
			//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
				
		//dropdown locator
		WebElement ele1=driver.findElement(By.id("searchDropdownBox"));
		Utility.selectBasedDropdown(ele1,"Books");
		
		
		
		
		//select tag use select class in selenium
		Select dd=new Select(ele1);
		
		System.out.println("Is dropdown support multiple selection?:"+dd.isMultiple());
		
		//single selection
		dd.selectByIndex(3);
		Thread.sleep(2000);
		dd.selectByValue("search-alias=nowstore");
		Thread.sleep(2000);
		dd.selectByVisibleText("Gift Cards");
		
		//To get all options from dropdown
		List<WebElement> allOptions=dd.getOptions();
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Prime Video"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		

	}

}
