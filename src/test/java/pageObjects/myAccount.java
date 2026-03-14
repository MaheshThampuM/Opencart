package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BasePage;

public class myAccount extends BasePage{
	
	

	
	public myAccount(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement myAcc;
	
	public boolean myAcntexist() {
		
		try {
		return (myAcc.isDisplayed());
		}
		catch (Exception e) {
			return false;
		}
		
	}
	
	

}
