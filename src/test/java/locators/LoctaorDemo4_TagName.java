package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoctaorDemo4_TagName {

	public static void main(String[] args)
	{
			//create driver session
		WebDriver driver=new ChromeDriver();
		//page load timeout
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		//Global Wait-WebElements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		//number of links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+allLinks.size());
		
		//for each loop
		//to get text and href value of every link
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
		}
		
		
		
		
	}

}
