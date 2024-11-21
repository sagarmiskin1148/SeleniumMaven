package locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathMethods {

	public static void main(String[] args) {

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		//click on Bestsellers link= text()
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();

		//text result=contains() with text()
		String text1=driver.findElement(By.xpath("(//h2[contains(text(),'Bestsellers')])[1]")).getText();
		System.out.println("Bestsellers Text is: "+text1);
	
		//open cart page-normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
	
		String text2=driver.findElement(By.xpath("//h2[normalize-space()='Your Amazon Cart is empty']")).getText();
		System.out.println("Cart page text is: "+text2);
	
		//search= contains() with attribute
		driver.findElement(By.xpath("//input[contains(@id,'twotabs')]")).sendKeys("watch");
		
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@role='button']"));
	
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
		}
		
		//search clear= starts-with()
		driver.findElement(By.xpath("//input[starts-with(@id,'twota')]")).clear();
		
	}

}
