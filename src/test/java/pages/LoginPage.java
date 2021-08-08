package pages;

import org.openqa.selenium.By;
import base.BeforeAndAfter;
import testcase.HomePage;

public class LoginPage extends BeforeAndAfter{
  private By oUsername=By.id("username");
  private By oPasssword=By.id("password");
  private By oSignIn=By.xpath("//button[text()='Sign In']");
  private By oRegister=By.xpath("//*[text()='Register For Account']");
  
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
	  return new HomePage();

}
  public LoginPage clickSignIn_InvalidDetails() {
	  driver.findElement(oSignIn).click();
	  boolean result= driver.findElement(oRegister).isDisplayed();
		 if(result) {
			 System.out.println("User is in Login Page due to invalid Credentials	");
		 }
		 else {
			 System.out.println("User is not in Login Page");
		 }
	  return this;

}
}