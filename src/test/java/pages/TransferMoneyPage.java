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
	//private WebDriver getDriver();
	//private SeleniumWrapper oWrap;
	
	
	public TransferMoneyPage select_from() {
		String fromtext=getDriver().findElement(From).getText();
		selectDropDownUsingVisibleText(getDriver().findElement(oFromAcc),fromtext);
		return this;
	}
	public TransferMoneyPage select_to() {
		String totext=getDriver().findElement(To).getText();
		selectDropDownUsingVisibleText(getDriver().findElement(oToAcc),totext);
		return this;
	}
	public TransferMoneyPage enter_amount() {
		type(getDriver().findElement(oAmount), "1");
		return this;
	}
	public Transferconfirmation click_review() {
		click(getDriver().findElement(oReview));
		return new Transferconfirmation();
	}
}
