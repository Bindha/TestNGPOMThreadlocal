package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC001_LoginPage extends BeforeAndAfter{
	@Test(priority = 1)
	public void verifyAlltheElements() {
		boolean result = new LoginPage().verifyElement();
		Assert.assertTrue(result);
	}
  @Test(priority = 2)
  public void loginWithValidCredential() {
	  new LoginPage()
	  .typeUserName("Brindha")
	  .typePassword("Rajabindhu30")
	  .clickSignIn()
	  .verifyHomepage()
	  .clickLogOut();
	  
  }
  @Test(priority = 3)
  public void loginWithInvalidCredential() {
	  new LoginPage()
	  .typeUserName("gsgs")
	  .typePassword("123")
	  .clickSignIn_InvalidDetails();
	  
  }
}
