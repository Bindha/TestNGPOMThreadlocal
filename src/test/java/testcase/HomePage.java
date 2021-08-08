package testcase;

import org.openqa.selenium.By;

import base.BeforeAndAfter;
import pages.LoginPage;

public class HomePage extends BeforeAndAfter{
 
 private By oWelcome=By.xpath("//h3[contains(text(),' Welcome!')]");
 private By oLogout=By.xpath("//a[text()='Logout']");
 
 public HomePage verifyHomepage() {
	 boolean result= driver.findElement(oWelcome).isDisplayed();
	 if(result) {
		 System.out.println("User Login is Successful");
	 }
	 else {
		 System.out.println("User Login Failed");
	 }
	 return this;
	 
 }
 public LoginPage clickLogOut() {
	 driver.findElement(oLogout).click();
	 return new LoginPage();
	 
 }
}
