package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC004_FundTransfer extends BeforeAndAfter {
	@BeforeTest
	public void setUpTestCase() {

		authors = "Brindha";
		category = "Smoke";
		testCaseName = "Fundtransfer";
		testDescription = "Testing the FundTransfer functionality";
		module = "FundTransfer Module";
	}

  @Test(priority = 1)
  public void verifyAlltheElements(){
	  boolean result = new LoginPage().verifyElement();
		Assert.assertTrue(result);
  }
  @Test(priority = 2)
  public void transferFund() {
	  new LoginPage()
	  .typeUserName("Brindha")
	  .typePassword("Rajabindhu30")
	  .clickSignIn().transferMoney()
	  .select_from().select_to()
	  .enter_amount().click_review()
	  .click_confirm_transfer().clickLogout();
		  
  }
  
}
