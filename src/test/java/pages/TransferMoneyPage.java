package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class TransferMoneyPage extends BeforeAndAfter{
	private By oFromAcc=By.xpath("//select[@id='fromAccount']");
	private By oToAcc=By.xpath("//select[@id='toAccount']");
	private By oAmount=By.xpath("//input[@id='amountTransferred']");
	private By oReview=By.xpath("(//button[@type='button'])[2]");
	private By From=By.xpath("(//option[@value='2: Object'])[1]");
	private By To=By.xpath("(//option[@value='3: Object'])[2]");
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	
	
	
	public TransferMoneyPage(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	public TransferMoneyPage select_from() {
		String fromtext=driver.findElement(From).getText();
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oFromAcc),fromtext);
		return this;
	}
	public TransferMoneyPage select_to() {
		String totext=driver.findElement(To).getText();
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oToAcc),totext);
		return this;
	}
	public TransferMoneyPage enter_amount() {
		oWrap.type(driver.findElement(oAmount), "1");
		return this;
	}
	public Transferconfirmation click_review() {
		oWrap.click(driver.findElement(oReview));
		return new Transferconfirmation(driver, node);
	}
}
