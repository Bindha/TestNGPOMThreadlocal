package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class LoanApplicationPage extends BeforeAndAfter {
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	private By oEmail=By.xpath("//input[@id='email']");
	private By oAmount=By.xpath("//input[@id='amount']");
	private By oTerm=By.xpath("//select[@id='term']");
	private By oIncome=By.xpath("//input[@id='income']");
	private By oAge=By.xpath("//input[@id='age']");
	private By oSubmit=By.xpath("//button[@id='submitButton']");

	public LoanApplicationPage(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver, node);
	}
	public LoanApplicationPage enter_email() {
		oWrap.type(driver.findElement(oEmail), "brindhat91@gmail.com");
		return this;
	}
	public LoanApplicationPage enter_amount() {
		oWrap.type(driver.findElement(oAmount), "100000");
		return this;
	}
	public LoanApplicationPage select_term() {
		oWrap.selectDropDownUsingVisibleText(driver.findElement(oTerm), "3");
		return this;
		}
	public LoanApplicationPage enter_income() {
		oWrap.type(driver.findElement(oIncome), "1000000");
		return this;
	}
	public LoanApplicationPage enter_age() {
		oWrap.type(driver.findElement(oAge),"29");
		return this;
	}
	public LoanApprovalPage submit_loan_application() {
		oWrap.click(driver.findElement(oSubmit));
		System.out.println("Loan application submitted for approval");
		return new LoanApprovalPage(driver,node);
	}
	
	

}
