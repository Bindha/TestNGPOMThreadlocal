package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOpenedPage {
	 private WebDriver driver;
	 private By congrts=By.xpath("//h1[contains(text(),'Congrats')]");
	  public AccountOpenedPage(WebDriver driver) {
	 	  this.driver=driver;
	  }
	  public AccountOpenedPage verifyPage() {

		boolean result= driver.findElement(congrts).isDisplayed();
		 if(result) {
			 System.out.println("User account is created");
		 }
		 else {
			 System.out.println("New account is not created");
		 }
		 return this;
		 
	  }
	  public HomePage viewAccount() {
	driver.findElement(By.xpath("//div[@id='viewAccounts']")).click();
	return new HomePage(driver);
}
}