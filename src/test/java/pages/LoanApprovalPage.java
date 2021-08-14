  package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class LoanApprovalPage extends BeforeAndAfter{
	private WebDriver driver;
	private SeleniumWrapper oWrap;
	private By oLoan=By.xpath("//button[@id='loanHomePage']");
	private By oCongrts=By.xpath("//h1[@class='text-center']");
	private By oRate=By.xpath("//span[@id='rateValue']");
	private By oLoanId=By.xpath("//h4[@id='loanID']");
	
	public LoanApprovalPage(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver, node);
	}
	public LoanApprovalPage verify_element() {
	    String text=driver.findElement(oCongrts).getText();
	    System.out.println(text);
	    String rate=driver.findElement(oRate).getText();
	    String id=driver.findElement(oLoanId).getText();
		if(text.contains("Congrats!")) {
			System.out.println("Loan is successfully approved");
			System.out.println("Interest rate is :"+rate+"%");
			System.out.println("loan Id is :" +id);
		}
		else {
			System.out.println("Loan is not approved");
		}
		return this;
	}
	public HomePage click_back_to_loan_center() {
		oWrap.click(driver.findElement(oLoan));
		return new HomePage(driver,node);
	}
	
	
	
	
}
