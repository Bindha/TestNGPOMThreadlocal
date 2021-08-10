package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage {
	 private WebDriver driver;
	  
	  public NewAccountPage(WebDriver driver) {
	 	  this.driver=driver;
	  }
	  public NewAccountPage accountNickName() {
		  driver.findElement(By.xpath("//input[@id='accountNickname']")).sendKeys("Kanya");
		  return this;
		  }
	  public NewAccountPage typeOfAccount() {
		  Select oSelect=new Select(driver.findElement(By.xpath("//select[@id='typeOfAccount']")));
		  oSelect.selectByVisibleText("Savings");
		  return this;
	  }
	  public AccountOpenedPage applyButton() {
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  return new AccountOpenedPage(driver);
		  
	  }
	  
}
