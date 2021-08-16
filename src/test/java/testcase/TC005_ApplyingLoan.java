package testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC005_ApplyingLoan extends BeforeAndAfter {
	@BeforeTest
	public void setUpTestCase() {

		authors = "Kanya";
		category = "Sanity";
		testCaseName = "ApplyLoan";
		testDescription = "Testing the ApplyLoan functionality";
		module = "ApplyLoan Module";
	}

	@Test(priority = 1)
	public void verifyAlltheElements() {
		boolean result = new LoginPage().verifyElement();
		Assert.assertTrue(result);
	}

	@Test(priority = 2)
  public void loanApplication() {
	  new LoginPage()
	  .typeUserName("Brindha")
	  .typePassword("Rajabindhu30")
	  .clickSignIn().applyLoan().click_apply_loan()
	  .enter_email().enter_amount().select_term()
	  .enter_income().enter_age()
	  .submit_loan_application()
	  .verify_element().click_back_to_loan_center()
	  .clickLogout();
  }
}
