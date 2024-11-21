package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_xpath_operators_index {

	public static void main(String[] args) {

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//fname-position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=1]")).sendKeys("Priyanka");
		
		//lname- and operator
		driver.findElement(By.xpath("//input[@class='form-control' and @name='lastname']")).sendKeys("Nigade");
		
		//email -index
		driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("sumi123@gmail.com");
		
		//telephone
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("786876875");
		
		//pas
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("1234");

		//cpas
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("1234");

		//yes radio button
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		
	}

}
