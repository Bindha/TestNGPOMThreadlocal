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
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	
	
	
	public TransferMoneyPage(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	public TransferMoneyPage select_from() {
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oFromAcc), "Kanya: 61129ec44c134a0040ea6697 - $100.00");
		return this;
	}
	public TransferMoneyPage select_to() {
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oToAcc), "Kanya: 61129f664c134a0040ea669c - $100.00");
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
