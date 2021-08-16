package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC003_ApplyNewAccount extends BeforeAndAfter {
	@BeforeTest
	public void setUpTestCase() {
		
		authors = "Kanya";
		category = "Regression";
		testCaseName = "NewAccount";
		testDescription = "Testing the account opening functionality";
		module = "Account opening Module";
	}
  @Test(priority = 1)
  public void verifyAlltheElements(){
	  boolean result = new LoginPage().verifyElement();
		Assert.assertTrue(result);
  }
  @Test(priority = 2)
  public void creatingAccount() {
	  new LoginPage()
	  .typeUserName("Brindha")
	  .typePassword("Rajabindhu30")
	  .clickSignIn().applyNewAccount().
	  accountNickName().typeOfAccount().applyButton().
	  verifyPage().viewAccount().accountCreated().clickLogout();
	  
  }  
}
