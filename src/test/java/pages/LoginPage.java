package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BeforeAndAfter;


public class LoginPage extends BeforeAndAfter{
  private By oUsername=By.id("username");
  private By oPasssword=By.id("password");
  private By oSignIn=By.xpath("//button[text()='Sign In']");
  private By oRegister=By.xpath("//*[text()='Register For Account']");
  private WebDriver driver;
   
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public boolean verifyElement() {
	  if(driver.findElement(oUsername).isDisplayed() &&
			  driver.findElement(oPasssword).isDisplayed() && driver.findElement(oSignIn).isDisplayed() && 
			  driver.findElement(oRegister).isDisplayed()){
		  return true;
	  }else {
		  return false;}
				  
		}
  
  public LoginPage typeUserName(String sUserName) {
	  driver.findElement(oUsername).sendKeys(sUserName);
	  return this;
	  
  }
  public LoginPage typePassword(String sPassword) {
	  driver.findElement(oPasssword).sendKeys(sPassword);
	  return this;
  
}
  public HomePage clickSignIn() {
	  driver.findElement(oSignIn).click();
	  return new HomePage(driver);

}
  public LoginPage clickSignIn_InvalidDetails() {
	  driver.findElement(oSignIn).click();
	  System.out.println("Checking whether the page is in home page or login page :");
	  boolean result= driver.findElement(oRegister).isDisplayed();
		 if(result) {
			 System.out.println("User remains in Login Page due to invalid Credentials	");
		 }
		 else {
			 System.out.println("User is not in Login Page");
		 }
	  return this;

}
  public Registrationpage clickRegisterAccount() {
	  driver.findElement(oRegister).click();
	  return new Registrationpage(driver);

}
  
}