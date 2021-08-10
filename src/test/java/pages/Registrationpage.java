package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.BeforeAndAfter;

public class Registrationpage extends BeforeAndAfter {
	private By oFirstName=By.id("firstName");
	private By oMiddleName=By.id("middleName");
	private By oLastName=By.id("lastName");
	private By oTitle=By.id("title");
	private By oGender=By.id("sex");
	private By oUserName=By.id("username");
	private By oEmail=By.id("email");
	private By oPassword=By.id("password");
	private By oRegister=By.xpath("//button[text()='Register']");
	private By oLogin=By.xpath("//a[text()='Login']");
	private WebDriver driver;
	   
	  public Registrationpage(WebDriver driver) {
		  this.driver=driver;
	  }
	

	
	public boolean verifyElement() {
		  if(driver.findElement(oUserName).isDisplayed() &&
				  driver.findElement(oEmail).isDisplayed() && driver.findElement(oPassword).isDisplayed() && 
				  driver.findElement(oRegister).isDisplayed()){
			  return true;
		  }else {
			  return false;}
					  
			}
	 public Registrationpage enter_the_first_name(String firstname) {
		  driver.findElement(oFirstName).sendKeys(firstname);
		  return this;
		  
	  }
	 public Registrationpage enter_the_middle_name(String middlename) {
		  driver.findElement(oMiddleName).sendKeys("T");
		  return this;
		  
	  } 
	 public Registrationpage enter_the_last_name(String lastname) {
		  driver.findElement(oLastName).sendKeys(lastname);
		  return this;
		  
	  }
	 
	 public Registrationpage select_the_title() {
	      Select oSelect=new Select(driver.findElement(oTitle));
	      oSelect.selectByVisibleText("Mrs");
		  return this;
		  
	  }
	 public Registrationpage select_the_gender() {
	      Select oSelect=new Select(driver.findElement(oGender));
	      oSelect.selectByVisibleText("Female");
		  return this;
		  
	  }
	 public Registrationpage enter_the_user_name(String username) {
		  driver.findElement(oUserName).sendKeys(username);
		  return this;
		  
	  }
	 public Registrationpage enter_the_email(String email) {
		  driver.findElement(oEmail).sendKeys(email);
		  return this;
		  
	  }
	 public Registrationpage enter_the_password(String password) {
		  driver.findElement(oPassword).sendKeys(password);
		  return this;
		  
	  }
	 public EmailVerificationPage click_on_register_button() {
	      driver.findElement(oRegister).click();
	      return new EmailVerificationPage(driver);
	 
	 }
	 public LoginPage clickOnLogin() {
			driver.findElement(oLogin).click();
			return new LoginPage(driver);

		}
	

}
