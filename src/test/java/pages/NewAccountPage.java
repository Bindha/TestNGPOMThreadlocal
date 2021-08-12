package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;


public class NewAccountPage extends BeforeAndAfter {
	 private WebDriver driver;
	 private SeleniumWrapper oWrap;
	 private By oSelect=By.xpath("//select[@id='typeOfAccount']");
	 private By oNickname=By.xpath("//input[@id='accountNickname']");
	 
	 	  public NewAccountPage(WebDriver driver, ExtentTest node) {
		  this.driver=driver;
		 	 this.node = node;
				oWrap = new SeleniumWrapper(driver,node);
	}
	public NewAccountPage accountNickName() {
		  oWrap.type(driver.findElement(oNickname),"Kanya");
		  return this;
		  }
	  public NewAccountPage typeOfAccount() {
		  oWrap.selectDropDownUsingVisibleText(driver.findElement(oSelect), "Savings");
		  return this;
	  }
	  public AccountOpenedPage applyButton() {
		  oWrap.click(driver.findElement(By.xpath("//button[@type='submit']")));
		  return new AccountOpenedPage(driver, node);
		  
	  }
	  
}
