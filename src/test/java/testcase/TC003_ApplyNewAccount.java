package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;

public class TC003_ApplyNewAccount extends BeforeAndAfter {
  @Test(priority = 1)
  public void verifyAlltheElements(){
	  boolean result = new LoginPage(driver).verifyElement();
		Assert.assertTrue(result);
  }
  @Test(priority = 2)
  public void creatingAccount() {
	  new LoginPage(driver)
	  .typeUserName("Brindha")
	  .typePassword("Rajabindhu30")
	  .clickSignIn().applyNewAccount().
	  accountNickName().typeOfAccount().applyButton().
	  verifyPage().viewAccount().accountCreated().clickLogOut();
	  
  }  

  
  
  
	  
	  
  
}
