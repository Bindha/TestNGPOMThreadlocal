package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class Transferconfirmation extends BeforeAndAfter{
	//private WebDriver getDriver();
	//private SeleniumWrapper oWrap;
	private By oConfirm=By.xpath("(//button[@type='button'])[5]");
	
	
	
	
	public HomePage click_confirm_transfer() {
		click(getDriver().findElement(oConfirm));
		System.out.println("Amount transferred succesfully");
		return new HomePage();
	
}
}