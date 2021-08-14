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
	private WebDriver driver;
	
	private SeleniumWrapper oWrap;

	public HomePage(WebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}

	public HomePage verifyHomePage() {
		boolean result = oWrap.verifyDisplayedwithReturn(driver.findElement(oWelcome));
		if(result) {
			System.out.println("User Login is Successfull!!!");
		}else {
			System.out.println("User Login Failed!!!");
		}
		return this;
	}

	public LoginPage clickLogout() {
		oWrap.click(driver.findElement(oLogout));
		return new LoginPage(driver,node);
	}


 public NewAccountPage applyNewAccount() {
	 oWrap.click(driver.findElement(By.xpath("//div[@tabindex='0']")));
	 return new NewAccountPage(driver,node);
 }
 
 public HomePage accountCreated() {
	 boolean result=oWrap.verifyDisplayedwithReturn( driver.findElement(oAccount));
	 if(result) {
		 System.out.println("Account Created in the name of Kanya ");
	 }
	 else {
		 System.out.println("account not created");
	 }
	 return this;
 }
 public TransferMoneyPage transferMoney() {
	 oWrap.click(driver.findElement(oTransfer));
	 System.out.println("To transfer funds");
	 return new TransferMoneyPage(driver, node);
 }
 public ApplyLoanPage applyLoan() {
	 oWrap.click(driver.findElement(oLoan));
	 System.out.println("Applying for new Loan");
	 return new ApplyLoanPage(driver,node);
 }
}
