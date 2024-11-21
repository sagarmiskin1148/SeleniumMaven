package webAutomationSpecialScenario;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameAutomation {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		//top--->left
		driver.switchTo().frame(0).switchTo().frame("frame-left");
		//driver.switchTo().frame("frame-left");
		System.out.println(driver.getPageSource());
		
		System.out.println("**************");
		//left to middle
		//come to baseFrame/First frame-top frame
		driver.switchTo().defaultContent();
		
		//middle
		driver.switchTo().frame(0).switchTo().frame("frame-middle");
		System.out.println(driver.getPageSource());
		
		
		System.out.println("**************");
		
		//come to baseFrame/First frame-top frame
			driver.switchTo().defaultContent();
				
			//right
			driver.switchTo().frame(0).switchTo().frame("frame-right");
			System.out.println(driver.getPageSource());
			System.out.println("**************");
			//come to baseFrame/First frame-top frame
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			System.out.println(driver.getPageSource());
		
	}

}
