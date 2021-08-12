package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class AccountOpenedPage extends BeforeAndAfter {
	 private WebDriver driver;
	 private By congrts=By.xpath("//h1[contains(text(),'Congrats')]");
	 private SeleniumWrapper oWrap;
	 
	 public AccountOpenedPage(WebDriver driver,ExtentTest node) {
			this.driver = driver;
			this.node = node;
			oWrap = new SeleniumWrapper(driver,node);
		}
	 
	  public AccountOpenedPage verifyPage() {

		boolean result=oWrap.verifyDisplayedwithReturn( driver.findElement(congrts));
		 if(result) {
			 System.out.println("User account is created");
		 }
		 else {
			 System.out.println("New account is not created");
		 }
		 return this;
		 
	  }
	  public HomePage viewAccount() {
	oWrap.click(driver.findElement(By.xpath("//div[@id='viewAccounts']")));
	return new HomePage(driver,node);
}
}