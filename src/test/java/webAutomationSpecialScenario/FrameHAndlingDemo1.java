package webAutomationSpecialScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHAndlingDemo1 {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//inside frame
		//index
		//driver.switchTo().frame(0);
		//using id/name
		//driver.switchTo().frame("mce_0_ifr");
		
		//Using WebElement
		WebElement frameEle=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameEle);
		
		WebElement ele=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
		ele.clear();
		ele.sendKeys("Hello All!");
		

	}

}
