package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BeforeAndAfter;


public class HomePage extends BeforeAndAfter{
 
 private By oWelcome=By.xpath("//h3[contains(text(),' Welcome!')]");
 private By oLogout=By.xpath("//a[text()='Logout']");
 private By oAccount=By.xpath("//strong[text()='Kanya']");
 private WebDriver driver;
 
 public HomePage(WebDriver driver) {
	  this.driver=driver;
 }
 
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
	 return new LoginPage(driver);
	 
 }
 public NewAccountPage applyNewAccount() {
	 driver.findElement(By.xpath("//div[@tabindex='0']")).click();
	 return new NewAccountPage(driver);
 }
 
 public HomePage accountCreated() {
	 boolean result= driver.findElement(oAccount).isDisplayed();
	 if(result) {
		 System.out.println("Account Created in the name of Kanya ");
	 }
	 else {
		 System.out.println("account not created");
	 }
	 return this;
 }
}
