package testcase;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BeforeAndAfter;
import pages.LoginPage;
import pages.Registrationpage;

 
	public class TC002_Registrationpage extends BeforeAndAfter{
		@BeforeTest
		public void setUpTestCase() {
			sSheetName = "TC002";
			authors = "Brindha";
			category = "Regression";
			testCaseName = "Registration";
			testDescription = "Testing the Registration functionality";
			module = "Registration Module";
		}

	  @Test(priority = 1)
	  public void verifyAlltheElements() {
		 
		 boolean result = new LoginPage(driver,node).clickRegisterAccount().verifyElement();
		  Assert.assertTrue(result);
		  new Registrationpage(driver,node).clickOnLogin();
	  
	  }
	  @Test(priority = 2,dataProvider = "ExcelData")
	public void registerWithMandatoryFields(String fName,String mName,String lName,String uName,String email,String password) {
		 new LoginPage(driver,node).clickRegisterAccount()
		 .enter_the_first_name(fName)
		 .enter_the_middle_name(mName)
		 .enter_the_last_name(lName)
				.select_the_title()
				.select_the_gender()
				.enter_the_user_name(uName + randomNumGen())
				.enter_the_email(email + randomNumGen() + "@credo.com")
				.enter_the_password(password)
				.click_on_register_button()
				.verifyUserRegistration().clickOnLogin();

	}

	public int randomNumGen() {
		Random ran = new Random();
		return ran.nextInt(1000);

	}

	}
