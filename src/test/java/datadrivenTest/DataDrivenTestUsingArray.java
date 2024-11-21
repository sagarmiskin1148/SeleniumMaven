package datadrivenTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestUsingArray
{
	
	//testdata
//	@DataProvider(name="testdata")
//	public Object[][] testData()
//	{
//	Object data[][]={{"Admin","admin123"},{"Pooja","test123"},{"Admin","admin123"},{"Amit","test123"}};
//	return data;
//	}
	
  @Test(dataProvider="testdata",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw)
  {
	  System.out.println("User Name is: "+un);
	  System.out.println("Password is : "+psw);
  }
}
