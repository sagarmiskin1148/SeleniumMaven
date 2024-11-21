package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG
{
	/*
	 * When assertion got fail you will get AssertionError
	 */
  @Test(enabled=false)
  public void hardAssertionTest()
  {
	  String act="TestNG is unit testing framework/library";
	  String exp="TestNG is unit & automation testing framework";
	  
//	  Assert.assertEquals(act,exp,"Fail: Strings are not equals");
//	  System.out.println("Pass: Strings are equals");
	  
//	  Assert.assertTrue(act.contains("automation"),"Fail: automation word is not present");
//	  System.out.println("Pass: automation word is present");
	  
	  Assert.assertFalse(act.contains("library"),"Fail: library is a part of actual string");
	  System.out.println("PAss: library is not a part of actual string");
	  
	  
	  
	  
  }
  
  @Test
  public void softAssertTest()
  {
	  SoftAssert sf=new SoftAssert();
	  int a=100,b=100;
	  
	  sf.assertEquals(a,b,"Fail: Numbers are not equal");
	  System.out.println("Pass: Numbers are equal");
	  sf.assertAll();
	  
  }
  
  
  
  
  
  
  
  
  
}
