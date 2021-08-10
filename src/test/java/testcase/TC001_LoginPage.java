package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC001_LoginPage extends BeforeAndAfter{
	
@BeforeTest
public void setUpTEstCase() {
	sSheetName="TC001";
}
	
	@Test(priority = 1)
	public void verifyAlltheElements() {
		boolean result = new LoginPage(driver).verifyElement();
		Assert.assertTrue(result);
	}
  @Test(priority = 2,dataProvider = "ExcelData")
  public void loginWithValidCredential(String uName,String password) {
	  new LoginPage(driver)
	  .typeUserName(uName)
	  .typePassword(password)
	  .clickSignIn()
	  .verifyHomepage()
	  .clickLogOut();
	  
  }
  @Test(priority = 3)
  public void loginWithInvalidCredential() {
	  new LoginPage(driver)
	  .typeUserName("gsgs")
	  .typePassword("123")
	  .clickSignIn_InvalidDetails();
	  
  }
}
