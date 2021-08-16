package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import base.BeforeAndAfter;
import libraries.SeleniumWrapper;

public class ApplyLoanPage extends BeforeAndAfter{
	//private WebDriver getDriver();
	// private SeleniumWrapper oWrap;
	 private By oApply=By.xpath("(//button[@id='applyButton'])[1]");
    
	

	public LoanApplicationPage click_apply_loan() {
		click(getDriver().findElement(oApply));
		return new LoanApplicationPage();
	}
	
	
	
	
}
