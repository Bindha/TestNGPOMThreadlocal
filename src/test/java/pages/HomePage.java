package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BeforeAndAfter;
import com.aventstack.extentreports.ExtentTest;

import libraries.SeleniumWrapper;

public class HomePage extends BeforeAndAfter{

	private By oWelcome = By.xpath("//h3[contains(text(),' Welcome!')]");
	private By oLogout = By.xpath("//a[text()='Logout']");
	 private By oAccount=By.xpath("//strong[text()='Kanya']");
	 private By oTransfer=By.xpath("(//a[@class='btn-blue-outline'])[1]");
	 private By oLoan=By.xpath("(//a[@id='applyForLoan'])[1]");
	//private WebDriver getDriver();
	
	//private SeleniumWrapper oWrap;

	
	public HomePage verifyHomePage() {
		boolean result = verifyDisplayedwithReturn(getDriver().findElement(oWelcome));
		if(result) {
			System.out.println("User Login is Successfull!!!");
		}else {
			System.out.println("User Login Failed!!!");
		}
		return this;
	}

	public LoginPage clickLogout() {
		click(getDriver().findElement(oLogout));
		return new LoginPage();
	}


 public NewAccountPage applyNewAccount() {
	 click(getDriver().findElement(By.xpath("//div[@tabindex='0']")));
	 return new NewAccountPage();
 }
 
 public HomePage accountCreated() {
	 boolean result=verifyDisplayedwithReturn( getDriver().findElement(oAccount));
	 if(result) {
		 System.out.println("Account Created in the name of Kanya ");
	 }
	 else {
		 System.out.println("account not created");
	 }
	 return this;
 }
 public TransferMoneyPage transferMoney() {
	 click(getDriver().findElement(oTransfer));
	 System.out.println("To transfer funds");
	 return new TransferMoneyPage();
 }
 public ApplyLoanPage applyLoan() {
	 click(getDriver().findElement(oLoan));
	 System.out.println("Applying for new Loan");
	 return new ApplyLoanPage();
 }
}
