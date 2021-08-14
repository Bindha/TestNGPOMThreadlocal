package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class Transferconfirmation extends BeforeAndAfter{
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	private By oConfirm=By.xpath("(//button[@type='button'])[5]");
	
	
	public Transferconfirmation(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	
	public HomePage click_confirm_transfer() {
		oWrap.click(driver.findElement(oConfirm));
		System.out.println("Amount transferred succesfully");
		return new HomePage(driver,node);
	
}
}