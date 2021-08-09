package pages;

import org.openqa.selenium.By;

import base.BeforeAndAfter;

public class EmailVerificationPage extends BeforeAndAfter{
  private By oWelcome=By.xpath("//*[text()=' Welcome To The UiBank Family! ']");
  private By oLogin=By.linkText("Login");

public EmailVerificationPage verifyUserRegistration(){
	boolean displayed = driver.findElement(oWelcome).isDisplayed();
	if(displayed) {
		System.out.println("User Registration is successful");
	}else {
		System.out.println("User Registration is not successful");
	}
	return this;
	
}
public LoginPage clickOnLogin() {
	driver.findElement(oLogin).click();
	return new LoginPage();

}

}





