package pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl() 
  {
	  //LoginPage lp=new LoginPage();
	  String url=lp.getAppUrl();
	  Assert.assertTrue(url.contains("login"),"Url Not matched!");
	  System.out.println("Url is matched!");
  }
  @Test(priority=2)
  public void verifyTitle() 
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.contains("Login"),"Title not matched!");
	  System.out.println("Title matched!");
}

  @Test(priority=3)
  public void verifyLogin() 
  {
	  lp.doLogin("test@gmail.com","test123");
	  Assert.assertTrue(lp.getAppUrl().contains("customers"),"LoginFail");
	  System.out.println("Login done!");
  }

}
