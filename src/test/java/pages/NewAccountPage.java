package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;


public class NewAccountPage extends BeforeAndAfter {
	// private WebDriver getDriver();
	 //private SeleniumWrapper oWrap;
	 private By oSelect=By.xpath("//select[@id='typeOfAccount']");
	 private By oNickname=By.xpath("//input[@id='accountNickname']");
	 
	 	
	public NewAccountPage accountNickName() {
		  type(getDriver().findElement(oNickname),"Kanya");
		  return this;
		  }
	  public NewAccountPage typeOfAccount() {
		  selectDropDownUsingVisibleText(getDriver().findElement(oSelect), "Savings");
		  return this;
	  }
	  public AccountOpenedPage applyButton() {
		  click(getDriver().findElement(By.xpath("//button[@type='submit']")));
		  return new AccountOpenedPage();
		  
	  }
	  
}
