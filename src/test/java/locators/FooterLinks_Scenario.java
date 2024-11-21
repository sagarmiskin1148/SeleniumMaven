package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks_Scenario {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		
		//footer links for Company
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[contains(@class,'cPuZNI')])[1]/li"));

		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
	}

}
