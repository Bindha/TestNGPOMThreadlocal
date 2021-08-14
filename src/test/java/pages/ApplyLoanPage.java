package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class ApplyLoanPage extends BeforeAndAfter{
	private WebDriver driver;
	 private SeleniumWrapper oWrap;
	 private By oApply=By.xpath("(//button[@id='applyButton'])[1]");
    
	

	public ApplyLoanPage(WebDriver driver, ExtentTest node) {
		this.driver = driver;
		this.node = node;
		oWrap = new SeleniumWrapper(driver,node);
	}
	public LoanApplicationPage click_apply_loan() {
		oWrap.click(driver.findElement(oApply));
		return new LoanApplicationPage(driver,node);
	}
	
	
	
	
}
